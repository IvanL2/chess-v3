package com.github.ivanl2.chess.piece;

import com.github.ivanl2.chess.board.event.MoveEvent;

public interface HasMoveListener {
	public void registerMoveEvent(MoveEvent e);
	public void moved();
}
