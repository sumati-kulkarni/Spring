package org.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.test.cars.Audi;
import org.test.cars.Chevrolet;
import org.test.specs.EngineType;

@Configuration
@ComponentScan("org.test")
public class AppConfig {
	
	@Bean("myAudi")
	public Audi audi() {
		return new Audi();
	}
	
	@Bean("myChevrolet")
	public Chevrolet chevrolet() {
		return new Chevrolet();
	}
	
	@Bean("engineType")
	public EngineType engineType() {
		return new EngineType("V8 Engine");
	}

}
