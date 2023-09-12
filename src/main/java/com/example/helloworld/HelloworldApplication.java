package com.example.helloworld;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.helloworld.model.HelloWorld;
import com.example.helloworld.service.BusinessService;
import com.example.helloworld.service.SayingHelloWorld;

@SpringBootApplication
public class HelloworldApplication implements CommandLineRunner{
	
@Autowired
 private  SayingHelloWorld businessService ;

	public static void main(String[] args) throws IOException {
		Properties vProp = new Properties();
		InputStream vInputStream = null;
		SpringApplication.run(HelloworldApplication.class, args);

		try {
			// getResourceAsStream, methode des type class
			vInputStream = HelloworldApplication.class.getResourceAsStream("/application.properties");
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

	
// la methode run de l interface CommandLineRunner est appelé en meme temps que l execution du programme 'main',
	// sans l appeler par nous meme
	// si cette methode etatit dans une autre class, au chargment de la class lors
	// de son instanciation
	// avec une retoune la class , la methode serait appelé, mais avec la classe
	// doit une annotation @component, @Beans, qui soit dans le contexte de l
	// application l ioc container
	
	//solution 3: on implemnte directement l interface dans le main class et sa methode run
	@Override
	public void run(String... args) throws Exception {
	
		System.out.println(businessService.getHelloWorld());
	}
	//solution2:
	/*@Bean
	 public ApplicationRunner runApplication() {
		return new  ApplicationRunner();
	}*/
	

}
