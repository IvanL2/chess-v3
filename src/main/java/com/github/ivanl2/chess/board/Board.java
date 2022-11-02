package com.github.ivanl2.chess.board;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.ivanl2.chess.piece.HasMoveListener;
import com.github.ivanl2.chess.piece.Piece;
import com.github.ivanl2.chess.piece.PieceColour;

public class Board implements Serializable {
	private static final long serialVersionUID = 200L;
	
	@Autowired
	private BoardState currentBoardState;
	
	private PieceColour turn;
	private MoveEvent moveEvent = new MoveEvent();
	private boolean gameStarted = false;
	private boolean checkmate = false;
	
	public Board() {
		
	}
	
	public boolean inCheck(BoardState state, PieceColour turn) {
		// TODO: implement
		return false;
	}
	
	private boolean isMate(BoardState state) {
		// TODO: implement
		return false;
	}
	
	public boolean isMate() {
		return checkmate;
	}
	
	public void start() {
		gameStarted = true;
		turn = PieceColour.WHITE;
		for (Piece p : currentBoardState.getAllPieces()) {
			if (p instanceof HasMoveListener) {
				((HasMoveListener)p).registerMoveEvent(null);
			}
		}
	}
	
	public PieceColour getTurn() {
		return turn;
	}
	
	public BoardState getBoardState() {
		return currentBoardState;
	}
	
	public PieceColour oppositeColour(PieceColour c) {
		switch (c) {
		case WHITE: return PieceColour.BLACK;
		case BLACK: return PieceColour.WHITE;
		default: throw new RuntimeException("bug, contact dev immediately");
		}
	}
	
	public boolean movePiece(int x, int y, int x2, int y2) {
		if (checkmate) return false;
		Piece p = currentBoardState.getPiece(x, y);
		if (p == null) return false;
		if (p.getColour() != turn) return false;
		if (!p.isLegalMove(currentBoardState, x2, y2)) return false;
		
		BoardState newBoardState = currentBoardState.clone();
		newBoardState.movePiece(x, y, x2, y2);
		if (inCheck(newBoardState, turn)) return false;
		if (isMate(newBoardState)) checkmate = true;
		moveEvent.fire();
		return true;
	}
	
}
