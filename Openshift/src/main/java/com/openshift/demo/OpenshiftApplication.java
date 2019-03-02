package com.openshift.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshiftApplication {

	@Value("${my.name}")
	private String name;

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "This is from Openshift version 1.3 " + name;
	}

}
