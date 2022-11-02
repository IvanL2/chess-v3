package com.github.ivanl2.chess.board;

public class GameNotStartedException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public GameNotStartedException(String message) {
		super(message);
	}
}
