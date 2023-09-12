package com.example.helloworld.model;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	private String value;
	
	public HelloWorld() {
		this.value= "Hello world class";
	}

 
	public String  getValue() {
		return value;
	}
	
	// la methode de class toString est surchargée et appelé directement au chargement de la classe
	@Override 
	public String toString(){
		return " to string class with class and attribut value  "+ value;
	}
}

