package com.example.helloworld.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.helloworld.service.SayingHelloWorld;

public class HelloWorldImpl implements SayingHelloWorld {
	
	HelloWorld helloWorld = new HelloWorld() ;
	@Override
	public HelloWorld getHelloWorld() {
		helloWorld.setValue("hello world");
		return helloWorld;
	}
}
