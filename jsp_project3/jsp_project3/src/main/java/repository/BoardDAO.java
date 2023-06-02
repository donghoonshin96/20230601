package repository;

import java.util.List;

import domain.BoardVO;
import domain.PagingVO;

public interface BoardDAO {

	int insert(BoardVO mvo);

	List<BoardVO> getBoardList();

	BoardVO getBoard(int detailBno);

	int deleteBoard(int deletedBno);

	int updateBoard(BoardVO updatedBoard);

	int updateCount(int bno);

	int totCount(PagingVO pgvo);

	List<BoardVO> pageList(PagingVO pgvo);

}
