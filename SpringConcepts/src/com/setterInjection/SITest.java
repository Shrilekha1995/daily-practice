package com.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SITest {
	
	public static void main(String [] args)
	{
	ApplicationContext contexct=new ClassPathXmlApplicationContext("SpringConfig.xml");
	Student student=contexct.getBean(Student.class);
    System.out.println(student);
	}

}
