package com.springConfigWithJava;

import org.springframework.stereotype.Component;

@Component("godd")
public class GoddDayService implements MyFortune {

	@Override
	public String getFortune() {
		
		return " good day service";
	}

}
