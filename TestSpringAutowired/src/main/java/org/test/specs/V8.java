package org.test.specs;

import org.springframework.stereotype.Component;
import org.test.interfaces.Engine;

@Component("V8Engine")
public class V8 implements Engine {

	@Override
	public String type() {
		
		return "V8 Engine";
	}

}
