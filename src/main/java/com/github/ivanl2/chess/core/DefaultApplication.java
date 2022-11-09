package com.github.ivanl2.chess.core;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.github.ivanl2.chess.gui.ChessApplication;

import javafx.application.Application;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class DefaultApplication {

	public static void main(String[] args) {
		Application.launch(ChessApplication.class, args);
	}

}
