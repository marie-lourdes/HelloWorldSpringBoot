package com.example.helloworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.helloworld.model.HelloWorld;

@Component
public class BusinessService implements SayingHelloWorld {
	
	// l annotation autowire injecte et intancie le bean HelloWorld,
	//evitez d utiliser les new et valeur arg constructor,pour plus de modularité
	@Autowired	
	HelloWorld helloWorld;
	
	@Override	
	public HelloWorld getHelloWorld () {
		 helloWorld.getValue();
		 return helloWorld;
	}

}
