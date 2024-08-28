package com.jsp.model;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dingi implements Instagram {
	@Autowired
	private Date date;

	@Override
	public String myChatList() {
		
		return "Dingi is Online"+date.getDate();
	}

}
