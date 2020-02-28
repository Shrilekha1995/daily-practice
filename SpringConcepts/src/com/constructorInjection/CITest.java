package com.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CITest {

	public static void main(String[] args) {
	
		
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		Person emp=(Person) context.getBean("person");;
		System.out.println(emp);
	


	}

}
