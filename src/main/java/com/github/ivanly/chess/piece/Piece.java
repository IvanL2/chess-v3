package com.github.ivanly.chess.piece;

import java.io.Serializable;

import com.github.ivanly.chess.board.BoardState;

public interface Piece extends Serializable {
	public PieceName getName();
	public PieceColour getColour();
	public boolean isLegalMove(BoardState board);
}
