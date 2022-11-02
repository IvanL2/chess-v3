package com.github.ivanl2.chess.board;

import com.github.ivanl2.chess.piece.Piece;

class BoardStateImpl implements BoardState {
	private static final long serialVersionUID = 1L;
	private Piece[][] board;
	
	public BoardStateImpl() {
		board = new Piece[8][8];
	}
	
	public Piece getPiece(int x, int y) {
		if (x < 0 || x > 7 || y < 0 || y > 8) throw new OutOfBoardBoundsException("Coordinates passed out of bounds: ("+x+","+y+")");
		return board[x][y];
	}
	
	public void addPiece(Piece p, int x, int y) {
		if (x < 0 || x > 7 || y < 0 || y > 8) throw new OutOfBoardBoundsException("Coordinates passed out of bounds: ("+x+","+y+")");
		board[x][y] = p;
	}
	
	public boolean removePiece(int x, int y) {
		if (x < 0 || x > 7 || y < 0 || y > 8) throw new OutOfBoardBoundsException("Coordinates passed out of bounds: ("+x+","+y+")");
		if (board[x][y] == null) return false;
		board[x][y] = null;
		return true;
	}
	
	public boolean movePiece(int x, int y, int x2, int y2) {
		if (x < 0 || x > 7 || y < 0 || y > 8 || x2 < 0 || x2 > 7 || y2 < 0 || y2 > 8) throw new OutOfBoardBoundsException("Coordinates passed out of bounds: ("+x+","+y+")");
		if (board[x][y] == null) return false;
		board[x2][y2] = board[x][y];
		board[x][y] = null;
		return true;
	}

	@Override
	public Piece[] getAllPieces() {
		// TODO Auto-generated method stub
		return null;
	}
}
