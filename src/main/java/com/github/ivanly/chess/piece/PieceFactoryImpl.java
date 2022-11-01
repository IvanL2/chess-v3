package com.github.ivanly.chess.piece;

class PieceFactoryImpl implements PieceFactory {
	private static final long serialVersionUID = 1L;
	@Override
	public Piece getPiece(PieceName name, PieceColour colour) {
		switch (name) {
		case BISHOP : return new Bishop(colour);
		case ROOK: return new Rook(colour);
		case KNIGHT: return new Knight(colour);
		case QUEEN: return new Queen(colour);
		case KING: return new King(colour);
		case PAWN: return new Pawn(colour);
		default: return null;
		}
	}
}
