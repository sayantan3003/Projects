package com.dassoftware.appgaming.game;

public class GameRunner {
	private GamingConsole gamingConsole;
	public GameRunner(GamingConsole gamingConsole) {
		this.gamingConsole = gamingConsole;
	}
	
	public void run() {
		System.out.println("Running game: " + gamingConsole.gameName());
		gamingConsole.up();
		gamingConsole.down();
		gamingConsole.right();
		gamingConsole.left();
	}
}
