package com.github.ivanl2.chess.board.event;

public interface Event {
	public void fire();
	public void registerListener(Listener l);
	public void deregisterListener(Listener l);
}
