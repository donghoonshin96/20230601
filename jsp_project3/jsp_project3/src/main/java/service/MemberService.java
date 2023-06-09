package service;

import java.util.List;

import domain.MemberVO;

public interface MemberService {

	int register(MemberVO mvo);

	MemberVO login(MemberVO mvo2);

	int lastLogin(String id2);

	int modify(MemberVO updatedMvo);

	int update(MemberVO mvo);

	MemberVO selectOne(String id);

	int delete(String id4);

	List<MemberVO> getMemberList();

}
