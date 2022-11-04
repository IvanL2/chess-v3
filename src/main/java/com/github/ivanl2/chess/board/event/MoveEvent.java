package com.github.ivanl2.chess.board.event;

import java.util.ArrayList;
import java.util.List;

public class MoveEvent implements Event {

	private List<Listener> listeners = new ArrayList<Listener>();
	@Override
	public void fire() {
		for (Listener l : listeners) {
			l.onEvent();
		}
	}

	public void registerListener(Listener l) {
		listeners.add(l);
	}

	@Override
	public void deregisterListener(Listener l) {
		listeners.remove(l);
	}
}
