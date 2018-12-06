package com.base.SpringBootWithC3P0Pooling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithC3P0Pooling {
	private static final Logger log = LoggerFactory.getLogger(SpringBootWithC3P0Pooling.class);
	

	public static void main(String[] args) {
		log.info("Inside SpringBootWithC3P0Pooling ");
		SpringApplication.run(SpringBootWithC3P0Pooling.class, args);
	}
}
