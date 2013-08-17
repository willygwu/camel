package com.hjh.ws;

import javax.jws.WebService;

@WebService
public class HelloworldWebService {

	public String getGreeting(String name){
		return "Hello " + name;
	}
}
