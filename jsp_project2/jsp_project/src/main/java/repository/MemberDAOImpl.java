package repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.MemberVO;
import orm.DatabaseBuilder;

public class MemberDAOImpl implements MemberDAO {
	private static final Logger log = LoggerFactory.getLogger(MemberDAOImpl.class);
	private SqlSession sql;
	private String NS = "MemberMapper.";

	public MemberDAOImpl() {
		new DatabaseBuilder();
		sql = DatabaseBuilder.getFactory().openSession();
	}

	@Override
	public int insert(MemberVO mvo) {
		int isOk = sql.insert(NS + "reg", mvo);
		if (isOk > 0) {
			sql.commit();
		}
		return isOk;
	}

	@Override
	public MemberVO selectOne(MemberVO mvo2) {
		log.info(">>> login DAO 진입");
		return sql.selectOne(NS + "login", mvo2);
	}

	@Override
	public int lastLogin(String id2) {
		log.info(">>> logout DAO 진입");
		int isOk = sql.update(NS + "logout", id2);
		if (isOk > 0) {
			sql.commit();
		}
		return isOk;
	}

	@Override
	public int update(MemberVO mvo) {
		log.info(">>> update DAO 진입");
		int isOk = sql.update(NS + "update", mvo);
		if (isOk > 0) {
			sql.commit();
		}
		return isOk;
	}

	@Override
	public int delete(String id4) {
		log.info(">>> delete DAO 진입~!!");
		int isOk = sql.delete(NS + "delete", id4);
		if (isOk > 0) {
			sql.commit();
		}
		return isOk;
	}

	@Override
	public List<MemberVO> getMemberList() {
		return sql.selectList(NS + "getMemberList");
	}

}
