package com.yessir.backend;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class YSApplication extends SpringBootServletInitializer {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		SpringApplication.run(YSApplication.class, args);
	}

}
