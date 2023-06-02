package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.MemberVO;
import service.MemberService;
import service.MemberServiceImpl;

@WebServlet("/mem/*")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// log설정
	// private static final Logger log = LoggerFactory.getLogger(클래스명.class);
	private static final Logger log = LoggerFactory.getLogger(MemberController.class);
	private RequestDispatcher rdp;
	private MemberService msv;
	private int isOk;
	private String destPage;

	public MemberController() {
		msv = new MemberServiceImpl();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// characterEncoding 설정 / contentType / uri
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");

		String uri = request.getRequestURI();
		log.info(">>> uri : " + uri);
//		System.out.println(">>>>"+uri);
		log.debug(uri);
		// /mem/join : 요청에 대한 path만 남기기
		String path = uri.substring(uri.lastIndexOf("/") + 1);
		log.info(">>> path : " + path);

		switch (path) {
		case "join":
			log.debug(">>>> " + path);
			destPage = "/member/join.jsp";
			break;
		case "register":
			// jsp에서 가져온 파라미터 저장
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			String email = request.getParameter("email");
			int age = Integer.parseInt(request.getParameter("age"));

			// 파라미터로 mvo 객체 생성
			MemberVO mvo = new MemberVO(id, password, email, age);
			isOk = msv.register(mvo);
			log.info(">>> JOIN > " + (isOk > 0 ? "success" : "fail"));
			destPage = "/";
			break;

		case "login": // 로그인 페이지로 이동
			log.info(">>> login page 이동");
			destPage = "/member/login.jsp";
			break;

		case "login_auth": // 실제 로그인이 일어나는 케이스
			try {
				String id2 = request.getParameter("id");
				String password2 = request.getParameter("password");
				MemberVO mvo2 = new MemberVO(id2, password2);
				// 해당 id, password가 db상에 있는지 체크
				// 해당 객체(사용자)를 가져와서
				// 해당 객체(사용자)를 세션에 담기
				log.info(">>> login 요청" + mvo2);
				MemberVO loginMvo = msv.login(mvo2);
				// 같은 정보가 있으면 객체를 리턴, 없다면 null이 리턴
				// 객체가 있다면 세션에 저장
				if (loginMvo != null) {
					// 세션을 가져오기. 연결된 세션이 없다면 새로 생성
					HttpSession ses = request.getSession();
					ses.setAttribute("ses", loginMvo);
					// 로그인 유지시간(초단위)
					ses.setMaxInactiveInterval(30 * 60);
				} else {
					request.setAttribute("msg_login", 0);
				}
				destPage = "/";

			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		case "logout":
			try {
				// 세션 가져오기 (연결된 세션)
				HttpSession ses = request.getSession();
				// 마지막 로그인 시간 기록
				MemberVO mvo2 = (MemberVO) ses.getAttribute("ses");
				String id2 = mvo2.getId();
				log.info(">>> login id : " + id2);
				// 로그인정보(id)를 주고 마지막 로그인 시간 기록(update)
				isOk = msv.lastLogin(id2);
				log.info(">>> logout > " + (isOk > 0 ? "success" : "fail"));
				ses.invalidate();
			} catch (Exception e) {
				// TODO: handle exception
			}
			destPage = "/";
			break;

		case "modify":
			destPage = "/member/modify.jsp";
			log.info(">>> modify page 이동");
			break;

		case "modify2":
			try {
				String id3 = request.getParameter("id");
				String password3 = request.getParameter("password");
				String email3 = request.getParameter("email");
				int age3 = Integer.parseInt(request.getParameter("age"));

				// 파라미터로 mvo 객체 생성
				MemberVO mvo3 = new MemberVO();
				mvo3.setId(id3);
				mvo3.setPassword(password3);
				mvo3.setEmail(email3);
				mvo3.setAge(age3);
				log.info(">>>>  mvo3"+mvo3);
				isOk = msv.update(mvo3);
				log.info(">>> MODIFY > " + (isOk > 0 ? "success" : "fail"));
				MemberVO updatedMvo = msv.selectOne(id3);
				HttpSession ses = request.getSession();
				ses.setAttribute("ses", updatedMvo);

				destPage = "/";

			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		case "delete":
			try {
				String id4 = request.getParameter("id");

				if (id4 != null && !id4.isEmpty()) {
					isOk = msv.delete(id4);
					log.info(">>> DELETE > " + (isOk > 0 ? "success" : "fail"));
				} else {
					log.info(">>> DELETE > id is null or empty");
				}

				// 삭제 후에는 세션을 제거합니다.
				HttpSession session = request.getSession();
				session.invalidate();

				// 삭제 후에는 다른 페이지로 이동할 수 있습니다.
				response.sendRedirect("/index.jsp");
				return; // 리다이렉트 수행 후 메소드를 종료합니다.
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "list":
			try {
				// 관리자 계정인지 확인
				HttpSession ses = request.getSession();
				MemberVO loggedInMvo = (MemberVO) ses.getAttribute("ses");
				if (loggedInMvo.getId().equals("admin")) {
					List<MemberVO> memberList = msv.getMemberList();
					request.setAttribute("memberList", memberList);
					destPage = "/member/list.jsp";
				} else {
					// 권한이 없는 경우 다른 페이지로 이동하도록 설정
					destPage = "/";
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		case "index":
			try {
				// 관리자 계정인지 확인
				HttpSession ses = request.getSession();
				MemberVO loggedInMvo = (MemberVO) ses.getAttribute("ses");
				if (loggedInMvo.getId().equals("admin")) {
					destPage = "/member/list.jsp";
				} else {
					destPage = "/"; // 다른 페이지로 이동하도록 설정
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		}
		rdp = request.getRequestDispatcher(destPage);
		rdp.forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		service(request, response);
	}

}
