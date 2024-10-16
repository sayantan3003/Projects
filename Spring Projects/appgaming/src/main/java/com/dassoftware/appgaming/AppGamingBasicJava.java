package com.dassoftware.appgaming;

import com.dassoftware.appgaming.game.GameRunner;
import com.dassoftware.appgaming.game.MarioGame;
import com.dassoftware.appgaming.game.PacMan;
import com.dassoftware.appgaming.game.SuperContra;

public class AppGamingBasicJava {
	
	public static void main(String[] args) {
//		var gameRunner = new GameRunner(new MarioGame());
//		var gameRunner = new GameRunner(new SuperContra());
		var gameRunner = new GameRunner(new PacMan());
		gameRunner.run();
	}
	
}
