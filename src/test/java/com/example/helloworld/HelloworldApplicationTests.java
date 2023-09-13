package com.example.helloworld;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.helloworld.service.BuenasDiasImpl;
import com.example.helloworld.service.BusinessService;
import com.example.helloworld.service.HelloWorldImpl;
import com.example.helloworld.service.ISayingHelloWorld;

@SpringBootTest
class HelloworldApplicationTests {
	
	@Autowired
	private  BusinessService businessService;


	//methode vide detest pour au moins executer la classe de test et verifier que le contexte spring est chargé lors de l execution de la class 
	//avec l annotation @SpringBootTest qui permet de charger le context spring le contexte de l application , l IoC container avec les Bean pour les utiliser 
	@Test
	void contextLoads() {
	}
	
	@Test
	void testHelloWorldTraducedInSpanishFromBusinessService() {
		ISayingHelloWorld helloWorldTraducedBybuenasDias= businessService.setHelloWorldTraduced(new BuenasDiasImpl());
		String expected = "buenas dias";
		String result =  helloWorldTraducedBybuenasDias.getHelloWorld().getValue();
		
		assertEquals( expected , result);
		
	}
	
	@Test
	void testHelloWorldTraducedInEnglishishFromBusinessService() {
		ISayingHelloWorld helloWorld= businessService.setHelloWorldTraduced(new HelloWorldImpl());
		String expected = "hello world";
		String result =  helloWorld.getHelloWorld().getValue();
		
		assertEquals( expected , result);
		
	}

}
