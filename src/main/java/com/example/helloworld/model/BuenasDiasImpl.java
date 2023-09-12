package com.example.helloworld.model;

import org.springframework.stereotype.Component;

import com.example.helloworld.service.SayingHelloWorld;

public class BuenasDiasImpl  implements SayingHelloWorld{
	
	public HelloWorld helloWorld = new HelloWorld() ;
	@Override
	public HelloWorld getHelloWorld() {
		this.helloWorld.setValue("buenas dias");
		return this.helloWorld;
	}
	
}
