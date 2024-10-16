package com.dassoftware.appgaming.game;

public class MarioGame implements GamingConsole{
	private static final String gameName = "Mario";
	
	@Override
	public String gameName() {
		return MarioGame.gameName;
	}
	
	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Lay down");
	}
	
	public void right() {
		System.out.println("Accelerate");
	}
	
	public void left() {
		System.out.println("Move Backward");
	}
}
