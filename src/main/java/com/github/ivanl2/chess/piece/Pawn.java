package com.github.ivanl2.chess.piece;

import com.github.ivanl2.chess.board.BoardState;
import com.github.ivanl2.chess.board.EnPassantRule;
import com.github.ivanl2.chess.board.MoveEvent;
import com.github.ivanl2.chess.board.MoveListener;

class Pawn implements Piece, FirstMoveRule, EnPassantRule {
	private static final long serialVersionUID = 100L;
	private final PieceColour colour;
	private boolean firstMove = true;
	private boolean enPassant = false;
	private MoveEvent moveEvent;
	private MoveListener listener;
	
	public Pawn(PieceColour colour) {
		this.colour = colour;
		listener = new MoveListener() {
			public void onEvent() {
				enPassant = false;
				moveEvent.deregisterListener(listener);
			}
		};
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
	public boolean isLegalMove(BoardState board, int x, int y {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String toString() {
		return "Pawn:"+colour;
	}
	@Override
	public boolean isFirstMove() {
		return firstMove;
	}
	@Override
	public void moved() {
		if (firstMove) {
			enPassant = true;
			moveEvent.registerListener(listener);
		}
		firstMove = false;
	}

	
	public void registerMoveEvent(MoveEvent e) {
		e.registerListener(null);
	}
}
