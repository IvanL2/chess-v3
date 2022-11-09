package com.github.ivanl2.chess.gui;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class WelcomeScene extends Scene {

	private static final Font DEFAULT_FONT = new Font("Calibri", 20);
	
	BorderPane root;
	public WelcomeScene() {
		
		super(new BorderPane(), 500, 100);
		
		
		
		root = (BorderPane)super.getRoot();
		StackPane pane = new StackPane();
		
		Text welc = new Text("Welcome to chess!");
		welc.setFont(DEFAULT_FONT);
		Button button = new Button("Start");
		button.setPrefSize(100, 50);
		button.setFont(DEFAULT_FONT);
		
		EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() { 
	         @Override 
	         public void handle(MouseEvent e) { 
	            System.out.println("LOL");
	         } 
	      };  
		
	    button.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
		StackPane.setAlignment(welc, Pos.CENTER);
		StackPane.setAlignment(button, Pos.BOTTOM_CENTER);
		pane.setMaxSize(300, 500);
		pane.getChildren().addAll(welc, button);
		
		root.setCenter(pane);
	}
	
	public WelcomeScene(Parent root, int x, int y) {
		super(root,x,y);
	}

}
