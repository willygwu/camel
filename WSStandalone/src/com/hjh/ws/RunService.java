package com.hjh.ws;

import javax.xml.ws.Endpoint;

public class RunService {

	public static void main(String[] args){
		System.out.println("Helloworld Web Service started");
		Endpoint.publish("http://localhost:8080/ws", new HelloworldWebService());
	}
}
