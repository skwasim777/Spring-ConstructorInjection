package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("emp.xml");
		Employee emp = (Employee) app.getBean("emp");
		emp.desplay();
	}
}
