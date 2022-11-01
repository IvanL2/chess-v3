package com.github.ivanly.chess.piece;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PieceFactoryConfig {
	@Bean(name="pieceFactoryService")
	public PieceFactory pieceFactory() {
		return new PieceFactoryImpl();
	}
}
