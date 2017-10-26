package com.greenfox.colors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColorsApplication implements CommandLineRunner {

	@Autowired
    MyColor myColor;
	@Autowired
	MyColor myColor2;

	public static void main(String[] args) {
		SpringApplication.run(ColorsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        myColor.printColor();
        myColor2.printColor();
	}
}
