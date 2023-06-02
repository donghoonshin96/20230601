package service;

import java.util.List;

import domain.BoardVO;
import domain.PagingVO;

public interface BoardService {

	int register(BoardVO bvo);

	List<BoardVO> getBoardList();

	BoardVO getBoard(int detailBno);

	int deleteBoard(int deletedBno);

	int updateBoard(BoardVO updatedBoard);

	int getTotal(PagingVO pgvo);

	List<BoardVO> getPageList(PagingVO pgvo);

}