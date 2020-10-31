package com.springboot.reactor.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class SpringbootReactorApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(SpringbootReactorApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootReactorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Flux<String> nombre = Flux.just("Jonathan","Camila","maria","Jessica")
				.doOnNext(elemento -> System.out.println(elemento));
		
		nombre.subscribe(elemento -> logger.info(elemento));
	}

}
