package com.springConfigWithJava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	
	@Qualifier("godd")
	@Autowired
	MyFortune myFortuneImpl;
	
	

	@Override
	public String getDailyWorkout() {
		
		return "30 min practice of tennis";
	}

	@Override
	public String getFortune() {
		return myFortuneImpl.getFortune();
	}

}
