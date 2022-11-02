package com.github.ivanl2.chess.board;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.github.ivanl2.chess.piece.Piece;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import java.util.Arrays;

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
	
	@Test
	public void testMovePiece() {
		Piece p = mock(Piece.class);
		board.addPiece(p, 0, 0);
		assertTrue(board.movePiece(0, 0, 1, 1));
		assertFalse(board.movePiece(0, 0, 1, 1));
		assertEquals(board.getPiece(0, 0), null);
		assertEquals(board.getPiece(1 ,1), p);
		
		Piece p2 = mock(Piece.class);
		board.addPiece(p2, 7, 7);
		assertTrue(board.movePiece(7, 7, 1, 1));
		assertEquals(board.getPiece(1, 1), p2);
		assertNotEquals(board.getPiece(1, 1), p);
		assertTrue(board.getAllPieces().length == 1); // piece taken
	}
	
	@Test
	public void testRemovePiece() {
		Piece p = mock(Piece.class);
		Piece p2 = mock(Piece.class);
		board.addPiece(p, 0, 0);
		board.addPiece(p2, 1, 5);
		assertTrue(Arrays.asList(board.getAllPieces()).contains(p));
		board.removePiece(0, 0);
		assertEquals(board.getPiece(0, 0), null);
		assertEquals(board.getAllPieces().length, 1);
	}
	
	@Test
	public void testGetAllPieces() {
		for (int i=0;i<64;i++) {
			board.addPiece(mock(Piece.class), i%8, i/8);
		}
		assertEquals(board.getAllPieces().length, 64);
		for (int i=0;i<64;i++) {
			board.removePiece(i%8, i/8);
		}
		assertEquals(board.getAllPieces().length, 0);
	}
}
