package com.example.helloworld.model;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	private String value;
	
	
	public String  getValue() {
		return value;
	}
 
	public String  setValue(String value) {
		return this.value=value ;
	}
	
	// la methode de class toString est surchargée et appelé directement au chargement de la classe
	@Override 
	public String toString(){
		return " to string class with class and attribut value  "+ value;
	}
}

