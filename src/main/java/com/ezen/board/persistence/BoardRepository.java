package com.ezen.board.persistence;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import com.ezen.board.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long>,  QuerydslPredicateExecutor<Board>{

	@Query("SELECT b FROM Board b")
	Page<Board> getBoardList(Pageable pageable);
}
