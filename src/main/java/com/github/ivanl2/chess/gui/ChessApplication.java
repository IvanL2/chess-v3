package com.github.ivanl2.chess.gui;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import com.github.ivanl2.chess.core.DefaultApplication;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;


public class ChessApplication extends Application implements ApplicationRunner {
	private ConfigurableApplicationContext applicationContext;
	
    @Override
    public void init() {
        applicationContext = new SpringApplicationBuilder(DefaultApplication.class).run();
    }
    
    @Override
    public void start(Stage stage) {
        applicationContext.publishEvent(new StageReadyEvent(stage));
        stage.setTitle("Chess!");
        stage.show();
    }
    @Override
    public void stop() {
        applicationContext.close();
        Platform.exit();
    }
    static class StageReadyEvent extends ApplicationEvent {
		private static final long serialVersionUID = 1L;

		public StageReadyEvent(Stage stage) {
            super(stage);
        }
    }
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Application.launch(args.getSourceArgs());
	}
}
