package com.github.ivanly.chess.piece;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;

public class PieceTest {
	@Autowired
	PieceFactory factory;

	@Test
	void testPawn() {
		Piece pawn = new Pawn(PieceColour.BLACK);
		assertEquals(pawn.getName(), "Pawn");
		assertEquals(pawn.getColour(), PieceColour.BLACK);
		assertEquals(pawn.toString(), "Pawn:BLACK");
		pawn = new Pawn(PieceColour.WHITE);
		assertEquals(pawn.getColour(), PieceColour.WHITE);
	}
	
	@Test
	void testRook() {
		Piece rook = new Rook(PieceColour.BLACK);
		assertEquals(rook.getName(), "Rook");
		assertEquals(rook.getColour(), PieceColour.BLACK);
		assertEquals(rook.toString(), "Rook:BLACK");
		rook = new Rook(PieceColour.WHITE);
		assertEquals(rook.getColour(), PieceColour.WHITE);
	}
	
	@Test
	void testKnight() {
		Piece knight = new Knight(PieceColour.BLACK);
		assertEquals(knight.getName(), "Knight");
		assertEquals(knight.getColour(), PieceColour.BLACK);
		assertEquals(knight.toString(), "Knight:BLACK");
		knight = new Knight(PieceColour.WHITE);
		assertEquals(knight.getColour(), PieceColour.WHITE);
	}
	
	@Test
	void testBishop() {
		Piece bishop = new Bishop(PieceColour.BLACK);
		assertEquals(bishop.getName(), "Bishop");
		assertEquals(bishop.getColour(), PieceColour.BLACK);
		assertEquals(bishop.toString(), "Bishop:BLACK");
		bishop = new Bishop(PieceColour.WHITE);
		assertEquals(bishop.getColour(), PieceColour.WHITE);
	}
	
	@Test
	void testKing() {
		Piece king = new King(PieceColour.BLACK);
		assertEquals(king.getName(), "King");
		assertEquals(king.getColour(), PieceColour.BLACK);
		assertEquals(king.toString(), "King:BLACK");
		king = new King(PieceColour.WHITE);
		assertEquals(king.getColour(), PieceColour.WHITE);
	}
	
	@Test
	void testQueen() {
		Piece queen = new Queen(PieceColour.BLACK);
		assertEquals(queen.getName(), "Queen");
		assertEquals(queen.getColour(), PieceColour.BLACK);
		assertEquals(queen.toString(), "Queen:BLACK");
		queen = new Queen(PieceColour.WHITE);
		assertEquals(queen.getColour(), PieceColour.WHITE);
	}
}
