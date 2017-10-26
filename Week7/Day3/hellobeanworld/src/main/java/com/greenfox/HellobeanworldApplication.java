package com.greenfox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner {

    @Autowired
    HelloWorld hello;

	public static void main(String[] args) {
		SpringApplication.run(HellobeanworldApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        hello.setMessage("Hello World!");
        hello.getMessage();
    }
}
