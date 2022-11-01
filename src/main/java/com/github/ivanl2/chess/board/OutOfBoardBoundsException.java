package com.github.ivanl2.chess.board;

public class OutOfBoardBoundsException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public OutOfBoardBoundsException(String errorMessage) {
		super(errorMessage);
	}
}
