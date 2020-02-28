package com.IOCConcepts;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {
	
	MyFortune fortune;
	
	public BaseBallCoach(){
		
	}
	
	public BaseBallCoach(MyFortune fortune) {
		super();
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout(){
		return "practice of 30 min baseball";
	}

	@Override
	public String getFortune() {
		return fortune.getFortune();
	}

}
