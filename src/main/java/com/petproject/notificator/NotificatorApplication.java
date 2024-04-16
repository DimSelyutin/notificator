package com.petproject.notificator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.petproject.notificator")
@EntityScan("com.petproject.notificator.entity")
public class NotificatorApplication {

	public static void main(String[] args) throws Throwable{
		SpringApplication.run(NotificatorApplication.class, args);
	}

}
