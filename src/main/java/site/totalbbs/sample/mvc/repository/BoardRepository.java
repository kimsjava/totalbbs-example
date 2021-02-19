package site.totalbbs.sample.mvc.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import site.totalbbs.sample.mvc.domain.Board;

/**
 * bbs Repository
 * @author kth7744
 *
 */
@Repository
public interface BoardRepository {

	List<Board> getList();
	
	Board get(int boardSeq);
	
	void save(Board board);
	
	void update(Board board);
	
	void delete(int boardSeq);
}
