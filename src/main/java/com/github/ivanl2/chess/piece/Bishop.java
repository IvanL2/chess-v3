package com.github.ivanl2.chess.piece;

import com.github.ivanl2.chess.board.BoardState;

class Bishop implements Piece {
	private static final long serialVersionUID = 103L;
	private final PieceColour colour;
	
	public Bishop(PieceColour colour) {
		this.colour = colour;
	}
	@Override
	public String getName() {
		return "Bishop";
	}

	@Override
	public PieceColour getColour() {
		return colour;
	}

	@Override
	public boolean isLegalMove(BoardState board, int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "Bishop:"+colour;
	}
}
