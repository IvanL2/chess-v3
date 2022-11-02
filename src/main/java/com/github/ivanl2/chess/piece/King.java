package com.github.ivanl2.chess.piece;

import com.github.ivanl2.chess.board.BoardState;

class King implements Piece, FirstMoveRule {
	private static final long serialVersionUID = 105L;
	private final PieceColour colour;
	private boolean firstMove = true;
	
	
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
	public boolean isLegalMove(BoardState board, int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String toString() {
		return "King:"+colour;
	}

	@Override
	public boolean isFirstMove() {
		return firstMove;
	}
	@Override
	public void moved() {
		firstMove = false;
	}

}
