package com.github.ivanl2.chess.piece;

import com.github.ivanl2.chess.board.BoardState;

class Knight implements Piece {
	private static final long serialVersionUID = 102L;
	private final PieceColour colour;
	
	public Knight(PieceColour colour) {
		this.colour = colour;
	}
	@Override
	public String getName() {
		return "Knight";
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
		return "Knight:"+colour;
	}

}
