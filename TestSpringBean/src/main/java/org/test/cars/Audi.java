package org.test.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.test.interfaces.Car;
import org.test.interfaces.Engine;

public class Audi implements Car {

	@Autowired
	@Qualifier("engineType")
	Engine engine;

	@Override
	public String specs() {
		String specs = "Hello from Audi " + engine.type();
		return specs;
	}

}
