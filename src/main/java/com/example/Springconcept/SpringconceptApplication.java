package com.example.Springconcept;

import org.springframework.context.ApplicationContext;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Springconcept.component.DemoBean;

@SpringBootApplication
public class SpringconceptApplication {
	public static final Logger logger=LoggerFactory.getLogger(SpringconceptApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome to Spring Concept");
		ApplicationContext context=SpringApplication.run(SpringconceptApplication.class, args);
		logger.debug("Checking Context: ",context.getBean(DemoBean.class));
	}

}
