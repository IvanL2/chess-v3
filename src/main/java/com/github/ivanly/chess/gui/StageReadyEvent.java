package com.github.ivanly.chess.gui;

import org.springframework.context.ApplicationEvent;

import javafx.stage.Stage;

public class StageReadyEvent extends ApplicationEvent {
	private static final long serialVersionUID = 1L;

	public StageReadyEvent(Stage stage) {
        super(stage);
    }
}