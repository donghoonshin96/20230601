package repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.BoardVO;
import domain.PagingVO;
import orm.DatabaseBuilder;
import service.BoardServiceImpl;

public class BoardDAOImpl implements BoardDAO {
	private static final Logger log = LoggerFactory.getLogger(BoardServiceImpl.class);

	private SqlSession sql;
	private String NS = "BoardMapper.";
	private int isOk;
	
	public BoardDAOImpl() {
		new DatabaseBuilder();
		sql = DatabaseBuilder.getFactory().openSession();
	}

	@Override
	public int insert(BoardVO bvo) {
		log.info(">>> insert DAO in");
		isOk = sql.insert(NS+"reg", bvo);
		if(isOk > 0) { sql.commit(); }
		return isOk;
	}

	@Override
	public List<BoardVO> selectList() {
		log.info(">>> list DAO in");
		return sql.selectList(NS+"list");
	}

	@Override
	public BoardVO selectOne(int bno) {
		// TODO Auto-generated method stub
		return sql.selectOne(NS+"detail", bno);
	}

	@Override
	public int update(BoardVO bvo) {
		log.info(">>> update DAO in");
		isOk = sql.insert(NS+"up", bvo);
		if(isOk > 0) { sql.commit(); }
		return isOk;
	}

	@Override
	public int delete(int bno) {
		// TODO Auto-generated method stub
		isOk = sql.delete(NS+"del", bno);
		if(isOk>0)sql.commit();
		return isOk;
	}

	@Override
	public int updateCount(int bno) {
		// TODO Auto-generated method stub
		isOk = sql.update(NS+"count", bno);
		if(isOk>0) sql.commit();
		return isOk;
	}

	@Override
	public int totCount(PagingVO pgvo) {
		// TODO Auto-generated method stub
		return sql.selectOne(NS+"cnt", pgvo);
	}

	@Override
	public List<BoardVO> pageList(PagingVO pgvo) {
		// TODO Auto-generated method stub
		//return sql.selectList(NS+"pageList", pgvo);
		return sql.selectList(NS+"selectList", pgvo);
	}

	@Override
	public String selectRemoveFile(int bno) {
		// TODO Auto-generated method stub
		return sql.selectOne(NS+"removeFile", bno);
	}
	
	
}
