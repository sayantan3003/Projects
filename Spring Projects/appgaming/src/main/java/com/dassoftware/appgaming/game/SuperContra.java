package com.dassoftware.appgaming.game;

public class SuperContra implements GamingConsole {
	private static final String gameName = "SuperContra";
	
	@Override
	public String gameName() {
		return SuperContra.gameName;
	}
	
	public void up() {
		System.out.println("Bamboo Copter");
	}
	
	public void down() {
		System.out.println("Hide in a hole");
	}
	
	public void right() {
		System.out.println("Fire");
	}
	
	public void left() {
		System.out.println("Move Backward");
	}
}
