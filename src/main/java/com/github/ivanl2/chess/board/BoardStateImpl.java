package com.github.ivanl2.chess.board;

import com.github.ivanl2.chess.piece.Piece;

class BoardStateImpl implements BoardState {
	private static final long serialVersionUID = 1L;
	private Piece[][] board;
	private int numberOfPieces = 0;
	
	public BoardStateImpl() {
		board = new Piece[8][8];
	}
	
	BoardStateImpl(Piece[][] pieces) {
		if (pieces.length != 8) throw new RuntimeException("Cannot create instance, pieces provided do not fit");
		if (pieces[0].length != 8) throw new RuntimeException("Cannot create instance, pieces provided do not fit");
		this.board = pieces;
		for (int i=0;i<8;i++) {
			for (int j=0;j<8;j++) {
				if (pieces[i][j] != null) numberOfPieces++;
			}
		}
	}
	
	public Piece getPiece(int x, int y) {
		if (x < 0 || x > 7 || y < 0 || y > 7) throw new OutOfBoardBoundsException("Coordinates passed out of bounds: ("+x+","+y+")");
		return board[x][y];
	}
	
	public void addPiece(Piece p, int x, int y) {
		if (x < 0 || x > 7 || y < 0 || y > 7) throw new OutOfBoardBoundsException("Coordinates passed out of bounds: ("+x+","+y+")");
		board[x][y] = p;
		numberOfPieces++;
	}
	
	public boolean removePiece(int x, int y) {
		if (x < 0 || x > 7 || y < 0 || y > 7) throw new OutOfBoardBoundsException("Coordinates passed out of bounds: ("+x+","+y+")");
		if (board[x][y] == null) return false;
		board[x][y] = null;
		numberOfPieces--;
		return true;
	}
	
	public boolean movePiece(int x, int y, int x2, int y2) {
		if (x < 0 || x > 7 || y < 0 || y > 7 || x2 < 0 || x2 > 7 || y2 < 0 || y2 > 7) throw new OutOfBoardBoundsException("Coordinates passed out of bounds: ("+x+","+y+")");
		if (board[x][y] == null) return false;
		if (board[x2][y2] != null) numberOfPieces--;
		board[x2][y2] = board[x][y];
		board[x][y] = null;
		return true;
	}

	@Override
	public Piece[] getAllPieces() {
		Piece[] pieces = new Piece[numberOfPieces];
		int k=0;
		for (int i=0;i<8;i++) {
			for (int j=0;j<8;j++) {
				if (k==numberOfPieces) {
					break;
				}
				if (board[i][j]!=null) {
					pieces[k]=board[i][j];
					k++;
				}
			}
		}
		return pieces;
	}
	
	@Override
	public BoardState clone() {
		return new BoardStateImpl(board);
	}
}
