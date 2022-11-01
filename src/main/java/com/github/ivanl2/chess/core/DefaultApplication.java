package com.github.ivanl2.chess.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.ivanl2.chess.gui.ChessApplication;

@SpringBootApplication
public class DefaultApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChessApplication.class, args);
	}

}
