package com.github.ivanly.chess.board;

import org.springframework.data.jpa.repository.JpaRepository;


public interface BoardRepository extends JpaRepository<BoardState, Long> {
	
}
