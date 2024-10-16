package com.dassoftware.appgaming.spring01;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingSpringFramework {
	public static void main(String[] args) {
		
		// 1: Launch a Spring Context
		try (var context = new AnnotationConfigApplicationContext(AppGamingSpringConfiguration.class)) {
			// 2: Configure the things that we want Spring to manage - 
			// AppGamingSpringConfiguration - @Configuration
			// name - @Bean
			
			// 3: Retrieving Beans managed by Spring
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			
			// No bean named address is present
			// System.out.println(context.getBean("address"));
			
			System.out.println(context.getBean("address2"));		// This line or next line, both are correct if only 1 Bean is present that is returning an Address object
			// System.out.println(context.getBean(Address.class));
			
			System.out.println(context.getBean("home"));
			
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3Parameters"));
			
			// One of the bean is primary
			System.out.println(context.getBean(Person.class));
			
			// employee
			System.out.println(context.getBean("employee"));
			
			System.out.println("\nSpring Beans:\n");
			
			// System.out.println for all Java Beans
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
