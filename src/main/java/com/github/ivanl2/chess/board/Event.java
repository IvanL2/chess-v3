package com.github.ivanl2.chess.board;

public interface Event {
	public void fire();
	public void registerListener(Listener l);
	public void deregisterListener(Listener l);
}
