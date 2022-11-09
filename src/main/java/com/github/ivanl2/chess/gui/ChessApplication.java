package com.github.ivanl2.chess.gui;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.github.ivanl2.chess.core.DefaultApplication;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class ChessApplication extends Application{
	private ConfigurableApplicationContext applicationContext;
	
	private static final int WINDOW_HEIGHT = 400;
	private static final int WINDOW_WIDTH = 1000;
	private static final String WINDOW_TITLE = "Chess";
	
    @Override
    public void init() {
    	String[] args = getParameters().getRaw().toArray(new String[0]);
        applicationContext = new SpringApplicationBuilder(DefaultApplication.class).run(args);
    }
    
    @Override
    public void start(Stage stage) {
        stage.setTitle(WINDOW_TITLE);
        stage.setHeight(WINDOW_HEIGHT);
        stage.setWidth(WINDOW_WIDTH);
        Scene welcome = new WelcomeScene();
        System.out.println(welcome.getHeight());
        stage.setScene(welcome);
        stage.show();
    }
    
    @Override
    public void stop() {
        this.applicationContext.close();
        Platform.exit();
    }
}
