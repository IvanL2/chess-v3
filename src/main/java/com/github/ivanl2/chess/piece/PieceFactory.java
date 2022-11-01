package com.github.ivanl2.chess.piece;

import java.io.Serializable;

public interface PieceFactory extends Serializable {
	public Piece getPiece(PieceName name, PieceColour colour);
}
