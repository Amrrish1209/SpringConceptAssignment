package com.example.Springconcept;

import org.springframework.context.ApplicationContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Springconcept.component.DemoBean;

@SpringBootApplication
public class SpringconceptApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Spring Concept");
		ApplicationContext context=SpringApplication.run(SpringconceptApplication.class, args);
		System.out.println("Checking Context: "+context.getBean(DemoBean.class));
	}

}
