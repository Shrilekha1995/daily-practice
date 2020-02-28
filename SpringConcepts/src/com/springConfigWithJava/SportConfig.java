package com.springConfigWithJava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan("com.springConfigWithJava")
public class SportConfig {
	
	@Bean
	public MyFortune fortuneService(){
		
	
	  return new MyFortuneImpl();
	}
	
	@Bean
	public Coach getCoach(){
		System.out.println("inside coach bean ");
		return new TennisCoach();
	}

}
