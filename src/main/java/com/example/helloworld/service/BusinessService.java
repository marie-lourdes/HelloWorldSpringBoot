package com.example.helloworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.helloworld.model.HelloWorld;

@Component
public class BusinessService  implements  SayingHelloWorld {
	
	// l annotation autowired injecte et intanciera une class de type intrface SayingHelloWorld
	//evitez d utiliser les new et valeur arg constructor,pour plus de modularité
	
	private SayingHelloWorld  sayingHelloWorld;
	
	//pattern strategy pourimplementer differnt helloworld en plusieur langues
	/*public SayingHelloWorld getHello (SayingHelloWorld sayingHelloworld) {
		return this.sayingHelloWorld = sayingHelloworld;
		
	}*/
// injection de dependance avec un setter et pour les classe Service un bonne pratique est passer une abstration une Interface 
	public SayingHelloWorld  setHelloWorldTraduced (SayingHelloWorld  sayingHelloWorld) {
		
		return this.sayingHelloWorld = sayingHelloWorld;
	}
	
	@Override
	public HelloWorld getHelloWorld () {
		
		return sayingHelloWorld.getHelloWorld ();
	}
	
	
}
