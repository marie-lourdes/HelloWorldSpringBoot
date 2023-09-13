package com.example.helloworld.service;

import org.springframework.stereotype.Component;

import com.example.helloworld.model.HelloWorld;

public class BuenasDiasImpl  implements ISayingHelloWorld{
	
	public HelloWorld helloWorld=new HelloWorld();
	@Override
	public HelloWorld getHelloWorld() {	
		this.helloWorld.setValue("buenas dias");
		return this.helloWorld;
	}
	
}
