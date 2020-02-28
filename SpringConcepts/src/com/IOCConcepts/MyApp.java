package com.IOCConcepts;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		Coach coach=(Coach) context.getBean("tennisCoach");
		System.out.println(coach.getFortune());
		System.out.println(coach.getDailyWorkout());
		
		

	}

}
