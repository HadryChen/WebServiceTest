package com.github.hadrychen.service;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import com.github.hadrychen.service.impl.Calculate;

public class WebServiceService {

	public int addMethod(int x,int y){
		return x + y;
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/Service/MyWebService", new Calculate());
		System.out.println("service start successs!!!");
	}
}
