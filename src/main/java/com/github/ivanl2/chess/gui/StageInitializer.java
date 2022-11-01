package com.github.ivanl2.chess.gui;

import org.springframework.context.ApplicationListener;

import javafx.stage.Stage;

public class StageInitializer implements ApplicationListener<StageReadyEvent>{
	@Override
	public void onApplicationEvent(StageReadyEvent event) {
		Stage stage = event.getStage();
	}
}
