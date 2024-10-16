package com.dassoftware.appgaming;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dassoftware.appgaming.game.GameRunner;
import com.dassoftware.appgaming.game.GamingConsole;

public class App03GamingSpringBeans {
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(GameConfiguration.class)) {
			context.getBean(GameRunner.class).run();
			context.getBean(GamingConsole.class).up();
		}
	}
}
