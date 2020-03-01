package org.test.cars;

import org.springframework.stereotype.Component;
import org.test.interfaces.Car;

@Component("audi")
public class Audi implements Car {

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		return "Hello from Audi";
	}

}
