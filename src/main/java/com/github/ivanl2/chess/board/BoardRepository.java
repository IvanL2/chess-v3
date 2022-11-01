package com.github.ivanl2.chess.board;

import org.springframework.data.jpa.repository.JpaRepository;


public interface BoardRepository extends JpaRepository<BoardState, Long> {
	
}
