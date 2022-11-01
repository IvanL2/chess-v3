package com.github.ivanly.chess.piece;

import com.github.ivanly.chess.board.BoardState;

class Rook implements Piece {
	private static final long serialVersionUID = 101L;
	private final PieceColour colour;
	
	public Rook(PieceColour colour) {
		this.colour = colour;
	}
	@Override
	public String getName() {
		return "Rook";
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
		return "Rook:"+colour;
	}
}
