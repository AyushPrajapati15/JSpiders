package com.jsp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dinga {
	@Autowired
//	@Qualifier("rani")
	Instagram instagram;
	public void chat()
	{
		System.out.println(instagram.myChatList());
	}

}
