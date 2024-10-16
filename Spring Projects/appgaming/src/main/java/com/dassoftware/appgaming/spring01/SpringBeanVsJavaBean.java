package com.dassoftware.appgaming.spring01;

import java.io.Serializable;

// Plain Old Java Object - Any Object in Java is POJO
class Pojo {
	private String text;
	private int number;
	
	Pojo(String text, int number) {
		this.text = text;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return text + " : " + number;
	}
}

/* Enterprise Java Beans - 
 * 1. Serializable interface should be implemented
 * 2. Public No-arg constructor should be present
 * 3. Geters & Seters should be present for each variable
 */

// Serializable interface is implemented
class JavaBean implements Serializable {			// EJB
	private String name;
	private int age;
	
	// Public no-arg constructor
	public JavaBean() {}
	
	// Geters & Seters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}


public class SpringBeanVsJavaBean {
	public static void main(String[] args) {
		Pojo pojo = new Pojo("Sayantan", 25);
		System.out.println(pojo);
	}
}
