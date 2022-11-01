package com.github.ivanly.chess.board;

public class OutOfBoardBoundsException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public OutOfBoardBoundsException(String errorMessage) {
		super(errorMessage);
	}
}
