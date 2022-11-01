package com.github.ivanly.chess.piece;

import com.github.ivanly.chess.board.BoardState;

class King implements Piece {
	private static final long serialVersionUID = 105L;
	private final PieceColour colour;
	
	public King(PieceColour colour) {
		this.colour = colour;
	}
	@Override
	public String getName() {
		return "King";
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
		return "King:"+colour;
	}

}
