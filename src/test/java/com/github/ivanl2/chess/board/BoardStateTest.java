package com.github.ivanl2.chess.board;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.github.ivanl2.chess.piece.Piece;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class BoardStateTest {
	
	
	private BoardState board;

	@BeforeEach
	public void setUp() {
		BoardConfig config = new BoardConfig();
		board = config.boardState();
	}
	
	@AfterEach
	public void tearDown() {
		board = null;
	}

	@Test
	public void testAddAndGetPiece() {
		Piece p = mock(Piece.class);
		Piece p2 = mock(Piece.class);
		board.addPiece(p, 0, 0);
		assertNotEquals(board.getPiece(0, 0), null);
		assertEquals(board.getAllPieces()[0], p);
		board.addPiece(p2, 0, 0);
		assertNotEquals(board.getPiece(0, 0), null);
		assertNotEquals(board.getPiece(0, 0), p);
		assertEquals(board.getPiece(0, 0), p2);
		board.addPiece(p, 7, 7);
		assertEquals(board.getPiece(7, 7), p);
		
		assertThrows(OutOfBoardBoundsException.class, () -> board.addPiece(p2, -1, -1));
		assertThrows(OutOfBoardBoundsException.class, () -> board.addPiece(p2, 8, 0));
		assertThrows(OutOfBoardBoundsException.class, () -> board.addPiece(p2, 0, 8));
		assertThrows(OutOfBoardBoundsException.class, () -> board.addPiece(p2, 8, 8));
		assertThrows(OutOfBoardBoundsException.class, () -> board.addPiece(p2, 0, -1));
		assertThrows(OutOfBoardBoundsException.class, () -> board.addPiece(p2, -1, 5));
	}
}
