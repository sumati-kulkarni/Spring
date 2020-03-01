package org.test.specs;

import org.springframework.stereotype.Component;
import org.test.interfaces.Engine;

@Component("engineType")
public class EngineType implements Engine {

	String type;
	
	public EngineType() {
		type = "Unknown";
	}

	public EngineType(String type) {
		this.type = type;
	}
	
	@Override
	public String type() {
		return type;
	}

}
