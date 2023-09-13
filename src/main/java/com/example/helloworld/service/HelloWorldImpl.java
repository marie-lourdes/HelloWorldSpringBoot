package com.example.helloworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.helloworld.model.HelloWorld;

public class HelloWorldImpl implements ISayingHelloWorld {
	
	HelloWorld helloWorld = new HelloWorld() ;
	@Override
	public HelloWorld getHelloWorld() {
		helloWorld.setValue("hello world");
		return helloWorld;
	}
}
