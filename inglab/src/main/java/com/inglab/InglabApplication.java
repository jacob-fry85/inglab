package com.inglab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.inglab.entity", "com.inglab"})
public class InglabApplication {

	public static void main(String[] args) {
		SpringApplication.run(InglabApplication.class, args);
	}

}
