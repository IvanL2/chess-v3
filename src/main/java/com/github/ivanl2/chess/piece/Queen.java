package com.github.ivanl2.chess.piece;

import com.github.ivanl2.chess.board.BoardState;

class Queen implements Piece {
	private static final long serialVersionUID = 104L;
	private final PieceColour colour;
	
	public Queen(PieceColour colour) {
		this.colour = colour;
	}
	@Override
	public String getName() {
		return "Queen";
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
		return "Queen:"+colour;
	}

}
