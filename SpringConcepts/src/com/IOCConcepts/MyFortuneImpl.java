package com.IOCConcepts;

import org.springframework.stereotype.Component;

@Component("abc")
public class MyFortuneImpl implements MyFortune {

	@Override
	public String getFortune() {
		return "its your lucky day";
	}

}
