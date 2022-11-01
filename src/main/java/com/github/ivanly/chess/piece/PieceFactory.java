package com.github.ivanly.chess.piece;

import java.io.Serializable;

public interface PieceFactory extends Serializable {
	public Piece getPiece(PieceName name, PieceColour colour);
}
