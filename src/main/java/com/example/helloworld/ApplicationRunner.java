package com.example.helloworld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


// solution 1Pour afficher  helloworl on utilise commandlinerunner et avec l annotation @Component, il sera detecter dans le contexte de l application l ioc container
//et l executera a l instanciation  et au chargement du du bean Component ApplicationRunner, lors de l execution du programme dans le main
// ou autre solution2:  charger cette classe comme un Bean  dans le main  (ou une classe qui contient une annotation de configuration comme @SpringBootApplication) et retourner  l instance de classe dans une methode dans HelloWorldApplication.java
//l appel de la classe avec l instanciation apellera la methode run de CommandLineRunner automatiquemennt lors de l execution du main
//
@Component
public class ApplicationRunner   implements CommandLineRunner{
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World!");
	}
}
