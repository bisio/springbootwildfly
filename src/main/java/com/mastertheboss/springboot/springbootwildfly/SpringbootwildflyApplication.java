package com.mastertheboss.springboot.springbootwildfly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringbootwildflyApplication extends SpringBootServletInitializer {

	private static Class<SpringbootwildflyApplication> applicationClass = SpringbootwildflyApplication.class;
	
	public static void main(String[] args) {
		SpringApplication.run(applicationClass, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(applicationClass);
	}

}

@RestController
class HelloController {
	
	@RequestMapping("/hello/{name}")
	String hello(@PathVariable String name) {
		return "Hi " + name + " !";
	}
}