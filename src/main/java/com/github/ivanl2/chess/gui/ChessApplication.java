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


public class ChessApplication extends Application{
	private ConfigurableApplicationContext applicationContext;
	
    @Override
    public void init() {
    	String[] args = getParameters().getRaw().toArray(new String[0]);
        applicationContext = new SpringApplicationBuilder(DefaultApplication.class).run(args);
    }
    
    @Override
    public void start(Stage stage) {
        stage.setTitle("test");
        stage.show();
    }
    
    @Override
    public void stop() {
        this.applicationContext.close();
        Platform.exit();
    }
    static class StageReadyEvent extends ApplicationEvent {
		private static final long serialVersionUID = 1L;

		public StageReadyEvent(Stage stage) {
            super(stage);
        }
		
	    public Stage getStage() {
	        return ((Stage) getSource());
	    }
    }
}
