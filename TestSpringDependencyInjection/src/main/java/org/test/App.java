package org.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.test.cars.Audi;
import org.test.cars.Chevrolet;
import org.test.interfaces.Car;

public class App {

	public static void main(String[] args) {
		Car audi = new Audi();
		Car chevy = new Chevrolet();

//		System.out.println(audi.specs());
//		System.out.println(chevy.specs());
		
//		Car myCar = new Audi();
//		
//		System.out.println(myCar.specs());
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car myCar = context.getBean("chevrolet", Car.class);
		System.out.println(myCar.specs());
		
		myCar = context.getBean("audi", Car.class);
		System.out.println(myCar.specs());
		
		context.close();
	}

}
