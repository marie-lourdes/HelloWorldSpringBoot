package com.example.helloworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.helloworld.model.HelloWorld;

@Component
public class BusinessService  implements  ISayingHelloWorld {
	
	// l annotation autowired injecte et intanciera une class de type intrface SayingHelloWorld
	//evitez d utiliser les new et valeur arg constructor,pour plus de modularité
	
	private ISayingHelloWorld  sayingHelloWorld;
	
	//pattern strategy pourimplementer differnt helloworld en plusieur langues
	/*public SayingHelloWorld getHello (SayingHelloWorld sayingHelloworld) {
		return this.sayingHelloWorld = sayingHelloworld;
		
	}*/
// injection de dependance avec un setter et pour les classe Service un bonne pratique est passer une abstraction une Interface 
	public ISayingHelloWorld  setHelloWorldTraduced (ISayingHelloWorld  sayingHelloWorld) {
		
		return this.sayingHelloWorld = sayingHelloWorld;
	}
	
	@Override
	public HelloWorld getHelloWorld () {
		
		return sayingHelloWorld.getHelloWorld ();
	}
	
	
}
