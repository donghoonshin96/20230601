package service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.BoardVO;
import domain.PagingVO;
import repository.BoardDAOImpl;
import repository.BoardDAO;

public class BoardServiceImpl implements BoardService {
	private static final Logger log = LoggerFactory.getLogger(BoardServiceImpl.class);
	private BoardDAO bdao;

	public BoardServiceImpl() {
		bdao = new BoardDAOImpl();
	}

	@Override
	public int insert(BoardVO bvo) {
		log.info("insert service in");
		
		return bdao.insert(bvo);
	}

	@Override
	public List<BoardVO> getList() {
		log.info("list service in");
		return bdao.selectList();
	}

	@Override
	public BoardVO getDetail(int bno) {
		// read_count update 요청 후 detail값을 요청
		int isOk = bdao.updateCount(bno);
		try {
			Thread.sleep(500); //0.5초 후에 selectOne() 요청
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return (isOk > 0)? bdao.selectOne(bno) : null;
	}

	@Override
	public int update(BoardVO bvo) {
		// TODO Auto-generated method stub
		return bdao.update(bvo);
	}

	@Override
	public int delete(int bno) {
		// TODO Auto-generated method stub
		return bdao.delete(bno);
	}

	@Override
	public int getTotal(PagingVO pgvo) {
		// TODO Auto-generated method stub
		return bdao.totCount(pgvo);
	}

	@Override
	public List<BoardVO> getPageList(PagingVO pgvo) {
		// TODO Auto-generated method stub
		return bdao.pageList(pgvo);
	}

	@Override
	public String getFileName(int bno) {
		// delete fileName 호출 
		return bdao.selectRemoveFile(bno);
	}

}
