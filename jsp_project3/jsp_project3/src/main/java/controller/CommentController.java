package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.CommentVO;
import service.CommentService;
import service.CommentServiceImpl;

@WebServlet("/cmt/*")
public class CommentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = LoggerFactory.getLogger(CommentController.class);
	// 목적지 주소로 보내는 destPage 쓰지않음.
	// 비동기 통신으로 요청이 온 곳으로 돌려보냄
	private int isOk;
	private CommentService csv;

	public CommentController() {
		csv = new CommentServiceImpl();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");

		String uri = request.getRequestURI();
		log.info(">>> uri > " + uri);

		String pathUri = uri.substring("/cmt/".length());
		String path = pathUri;
		String pathVar = "";
		if (pathUri.contains("/")) {
			path = pathUri.substring(0, pathUri.lastIndexOf("/"));
			pathVar = pathUri.substring(pathUri.lastIndexOf("/") + 1);
		}

		switch (path) {
		case "post":
			try {

				StringBuffer sb = new StringBuffer();
				String line = "";
				BufferedReader br = request.getReader();
				while ((line = br.readLine()) != null) {
					sb.append(line);

				}
				log.info(">>>> sb : " + sb.toString());

				JSONParser parser = new JSONParser();
				JSONObject jsonObj = (JSONObject) parser.parse(sb.toString());

				int bno = Integer.parseInt(jsonObj.get("bno").toString());
				String writer = jsonObj.get("writer").toString();
				String content = jsonObj.get("content").toString();
				CommentVO cvo = new CommentVO(bno, writer, content);
				log.info(">>>>>> cvo > " + cvo);
				isOk = csv.post(cvo);
				log.info(">>>> post : " + (isOk > 0 ? "Ok" : "Fail"));

				PrintWriter out = response.getWriter();
				out.print(isOk);

			} catch (Exception e) {
				log.info(">>>> comment post > error");
				e.printStackTrace();
			}
			break;

		case "list":
			try {
				int bno = Integer.parseInt(pathVar);
				List<CommentVO> list = csv.getList(bno);
				log.info(">>>> Comment List > DB ok");

				JSONObject[] jsonObjArr = new JSONObject[list.size()];
				JSONArray jsonObjList = new JSONArray();
				for (int i = 0; i < list.size(); i++) {
					jsonObjArr[i] = new JSONObject(); // key : value
					jsonObjArr[i].put("cno", list.get(i).getCno());
					jsonObjArr[i].put("bno", list.get(i).getBno());
					jsonObjArr[i].put("writer", list.get(i).getWriter());
					jsonObjArr[i].put("content", list.get(i).getContent());
					jsonObjArr[i].put("reg_date", list.get(i).getReg_date());

					jsonObjList.add(jsonObjArr[i]);
				}

				log.info(">>>> jsonObjList >>" + jsonObjList);

				String jsonData = jsonObjList.toJSONString();
				log.info(">>>> jsonData >>" + jsonData);

				PrintWriter out = response.getWriter();
				out.print(jsonData);

			} catch (Exception e) {
				log.info(">>>> comment list > error");
				e.printStackTrace();
			}
			break;
		case "remove":
			try {
				int cno = Integer.parseInt(request.getParameter("cnoVal"));
				log.info(">>> cno > " + cno);

				isOk = csv.remove(cno);
				log.info(">>> remove > " + ((isOk > 0) ? "OK" : "FAIL"));
				PrintWriter out = response.getWriter();
				out.print(isOk);

			} catch (Exception e) {
				log.info("remove error");
				e.printStackTrace();
			}
			break;

		case "modify":
			try {
				StringBuffer sb = new StringBuffer();
				String line = null;
				BufferedReader br = request.getReader();
				while ((line = br.readLine()) != null) {
					sb.append(line);

				}
				log.info(">>>> sb : " + sb.toString());

				JSONParser parser = new JSONParser();
				JSONObject jsonObj = (JSONObject) parser.parse(sb.toString());

				int cno = Integer.parseInt(jsonObj.get("cno").toString());
				String content = jsonObj.get("content").toString();

				CommentVO cvo = new CommentVO();
				cvo.setCno(cno);
				cvo.setContent(content);

				log.info(">>>>>> cvo > " + cvo);
				isOk = csv.modify(cvo);
				log.info(">>>> modify : " + (isOk > 0 ? "Ok" : "Fail"));

				PrintWriter out = response.getWriter();
				out.print(isOk);

			} catch (Exception e) {
				log.info(">>>>  modify > error");
				e.printStackTrace();
			}
			break;
		}

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
