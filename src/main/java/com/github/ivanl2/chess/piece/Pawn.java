package com.github.ivanl2.chess.piece;

import com.github.ivanl2.chess.board.BoardState;

class Pawn implements Piece {
	private static final long serialVersionUID = 100L;
	private final PieceColour colour;
	
	public Pawn(PieceColour colour) {
		this.colour = colour;
	}
	@Override
	public String getName() {
		return "Pawn";
	}

	@Override
	public PieceColour getColour() {
		return colour;
	}

	@Override
	public boolean isLegalMove(BoardState board) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String toString() {
		return "Pawn:"+colour;
	}

}
