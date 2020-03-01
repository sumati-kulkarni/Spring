package org.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.test.interfaces.Car;

public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car myCar = context.getBean("myChevrolet", Car.class);
		System.out.println(myCar.specs());
		
		myCar = context.getBean("myAudi", Car.class);
		System.out.println(myCar.specs());
		
		context.close();
	}

}
