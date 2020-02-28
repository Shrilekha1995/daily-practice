package com.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class ScopeConcepts {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		Employee emp=(Employee) context.getBean("employee");
		emp.setId(1);
		emp.setName("abc");
		System.out.println(emp);
	Employee emp2=(Employee) context.getBean("employee");
    System.out.println(emp2);
   ((AbstractApplicationContext) context).close();
    

	}

}
