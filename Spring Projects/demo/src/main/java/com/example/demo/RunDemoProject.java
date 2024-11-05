package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunDemoProject {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(DemoConfiguration.class);
		System.out.println(app.getBean("run"));
		
		var address = app.getBean(Address.class);
		
		System.out.println(address);
		System.out.println(address.address1());
		address.testAddress();
	}
}
