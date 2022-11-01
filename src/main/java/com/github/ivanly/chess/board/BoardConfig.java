package com.github.ivanly.chess.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.ivanly.chess.piece.PieceFactory;
import static com.github.ivanly.chess.piece.PieceName.*;
import static com.github.ivanly.chess.piece.PieceColour.*;


@Configuration
public class BoardConfig {
	
	@Autowired
	private PieceFactory factory;
	
	@Bean
	BoardState boardState() {
		BoardState b = new BoardState();
		b.addPiece(factory.getPiece(ROOK, WHITE), 0, 0);
		b.addPiece(factory.getPiece(KNIGHT, WHITE), 1, 0);
		b.addPiece(factory.getPiece(BISHOP, WHITE), 2, 0);
		b.addPiece(factory.getPiece(QUEEN, WHITE), 3, 0);
		b.addPiece(factory.getPiece(KING, WHITE), 4, 0);
		b.addPiece(factory.getPiece(ROOK, WHITE), 7, 0);
		b.addPiece(factory.getPiece(KNIGHT, WHITE), 6, 0);
		b.addPiece(factory.getPiece(BISHOP, WHITE), 5, 0);
		
		b.addPiece(factory.getPiece(ROOK, BLACK), 0, 7);
		b.addPiece(factory.getPiece(KNIGHT, BLACK), 1, 7);
		b.addPiece(factory.getPiece(BISHOP, BLACK), 2, 7);
		b.addPiece(factory.getPiece(QUEEN, BLACK), 3, 7);
		b.addPiece(factory.getPiece(KING, BLACK), 4, 7);
		b.addPiece(factory.getPiece(ROOK, BLACK), 7, 7);
		b.addPiece(factory.getPiece(KNIGHT, BLACK), 6, 7);
		b.addPiece(factory.getPiece(BISHOP, BLACK), 5, 7);
		
		for (int i=0; i<8; i++) {
			b.addPiece(factory.getPiece(PAWN, BLACK), i, 6);
			b.addPiece(factory.getPiece(PAWN, BLACK), 2, 6);
		}
		
		return b;
	}
}
