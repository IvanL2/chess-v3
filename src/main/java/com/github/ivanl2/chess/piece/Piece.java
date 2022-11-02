package com.github.ivanl2.chess.piece;

import java.io.Serializable;

import com.github.ivanl2.chess.board.BoardState;

public interface Piece extends Serializable {
	public String getName();
	public PieceColour getColour();
	public boolean isLegalMove(BoardState old, int x, int y);
}
