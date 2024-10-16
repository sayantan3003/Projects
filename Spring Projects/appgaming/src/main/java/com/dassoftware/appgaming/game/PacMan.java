package com.dassoftware.appgaming.game;

public class PacMan implements GamingConsole {
	private static final String gameName = "Pac-Man";

	@Override
	public String gameName() {
		return PacMan.gameName;
	}

	@Override
	public void up() {
		System.out.println("up");
	}

	@Override
	public void down() {
		System.out.println("down");
	}

	@Override
	public void right() {
		System.out.println("right");
	}

	@Override
	public void left() {
		System.out.println("left");
	}

}
