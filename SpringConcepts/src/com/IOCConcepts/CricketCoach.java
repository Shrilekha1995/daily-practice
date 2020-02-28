package com.IOCConcepts;

public class CricketCoach implements Coach {

	MyFortune fortune;
	
	public CricketCoach(){
		System.out.println(" CricketCoach()");
	}
	
	
	
	public void setFortune(MyFortune fortune) {
		this.fortune = fortune;
	}



	@Override
	public String getDailyWorkout() {
	
		return "cricket practice for 30 min";
	}

	@Override
	public String getFortune() {
		
		return fortune.getFortune();
	}

}
