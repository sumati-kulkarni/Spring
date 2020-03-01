package org.test.specs;

import org.springframework.stereotype.Component;
import org.test.interfaces.Engine;

@Component("V6Engine")
public class V6 implements Engine {

	@Override
	public String type() {
		
		return "V6 Engine";
	}

}
