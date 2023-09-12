package com.example.helloworld.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.helloworld.service.SayingHelloWorld;

public class HelloWorldImpl implements SayingHelloWorld {
	@Autowired 
	HelloWorld helloWorld;
	@Override
	public HelloWorld getHelloWorld() {
		helloWorld.setValue("hello world");
		return helloWorld;
	}
}
