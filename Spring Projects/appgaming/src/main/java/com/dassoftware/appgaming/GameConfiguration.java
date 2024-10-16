package com.dassoftware.appgaming;

import org.springframework.context.annotation.Bean;

import com.dassoftware.appgaming.game.GameRunner;
import com.dassoftware.appgaming.game.GamingConsole;
import com.dassoftware.appgaming.game.MarioGame;

public class GameConfiguration {
	@Bean
	public GamingConsole gamingConsole() {
		return new MarioGame();
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole gamingConsole) {
		return new GameRunner(gamingConsole);
	}
}
