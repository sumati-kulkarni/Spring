package org.test.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.test.interfaces.Car;
import org.test.interfaces.Engine;

@Component("audi")
public class Audi implements Car {

	//Engine engine = new Engine();
	//@Autowired(required = false)
	
//	@Autowired
//	Engine v6;
	
	@Autowired
	@Qualifier("V8Engine")
	Engine engine;
	 
//	Engine engine;
	
//	//@Autowired
//	public void setEngine(Engine engine) {
//		engine.type = "New V8 Engine";
//		this.engine = engine;
//	}
	
//	@Autowired(required = false)
	
//	public Audi(Engine engine) {
////		super();
////		this.engine = engine;
//		engine.type = "New V8 Engine";
//		this.engine = engine;
//	}

	@Override
	public String specs() {
		String specs = "Hello from Audi " + engine.type();
//		String specs = "Hello from Audi from unknown";
		return specs;
	}

}
