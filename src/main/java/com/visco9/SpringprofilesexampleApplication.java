package com.visco9;

import com.visco9.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringprofilesexampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringprofilesexampleApplication.class, args);
		GreetingController ctrl = (GreetingController)ctx.getBean("greetingController");
		ctrl.sayHello();
	}
}
