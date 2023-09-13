package com.example.helloworld.service;

import org.springframework.stereotype.Component;

import com.example.helloworld.model.HelloWorld;

public class BuenosDiasImpl  implements ISayingHelloWorld{
	
	public HelloWorld helloWorld=new HelloWorld();
	@Override
	public HelloWorld getHelloWorld() {	
		this.helloWorld.setValue("buenos dias");
		return this.helloWorld;
	}
	
}
