package com.blog.dabnbackapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class DabnbackApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DabnbackApiApplication.class, args);
	}

}
