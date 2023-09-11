package com.example.helloworld;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) throws IOException {
		Properties vProp = new Properties();
		InputStream vInputStream = null;
		SpringApplication.run(HelloworldApplication.class, args);
		
		try {
			// getResourceAsStream, methode des type class
			vInputStream =  HelloworldApplication.class.getResourceAsStream("/application.properties");
			// load() methode de la classe Properties, qui une liste de proprité dans un
			// inputStream
			vProp.load(vInputStream);
// provoque erreur null car c etait sur la based un seul fichier, a oresent deux fichier info.properties dans deux dossier de conf dans /reesourcs, il faut filter dans le pom.xml
		} finally {
			if (vInputStream != null) {
				vInputStream.close();
			}

		}
		System.out.println(" propriété nom de l application defini dans application.properties: "
				+ vProp.getProperty("spring.application.name", "?"));
		// on recupere la propriété crée dans info.properties , dont la valeur est passé
		// dans le second parametre avec "?"
		
	}
	
}
