package com.trial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Trial1Application {

	//http://localhost:8888/trial1client/default/master
	public static void main(String[] args) {
		SpringApplication.run(Trial1Application.class, args);
	}
}
