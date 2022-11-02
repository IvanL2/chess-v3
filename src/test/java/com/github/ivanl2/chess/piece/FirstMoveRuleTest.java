package com.github.ivanl2.chess.piece;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.github.ivanl2.chess.board.MoveEvent;

public class FirstMoveRuleTest {
	
	@Test
	public void testPawn() {
		Pawn pawn = new Pawn(PieceColour.BLACK);
		pawn.registerMoveEvent(new MoveEvent());
		assertTrue(pawn.isFirstMove());
		pawn.moved();
		assertFalse(pawn.isFirstMove());
	}
	
	@Test
	public void testKing() {
		FirstMoveRule king = new King(PieceColour.BLACK);
		assertTrue(king.isFirstMove());
		king.moved();
		assertFalse(king.isFirstMove());
	}
	
	@Test
	public void testRook() {
		FirstMoveRule rook = new Rook(PieceColour.BLACK);
		assertTrue(rook.isFirstMove());
		rook.moved();
		assertFalse(rook.isFirstMove());
	}
}
