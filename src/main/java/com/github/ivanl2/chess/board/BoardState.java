package com.github.ivanl2.chess.board;

import java.io.Serializable;

import com.github.ivanl2.chess.piece.Piece;

public interface BoardState extends Serializable {
	
	public Piece getPiece(int x, int y);
	public Piece[] getAllPieces();
	public void addPiece(Piece p, int x, int y);
	public boolean removePiece(int x, int y);
	public boolean movePiece(int x, int y, int x2, int y2);
	public BoardState clone();
}
