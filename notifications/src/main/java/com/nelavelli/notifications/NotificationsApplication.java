package com.nelavelli.notifications;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;

/**
 * 
 * @author Nelavelli Naresh
 *
 */
@SpringBootApplication
@EnableWebFlux
public class NotificationsApplication implements WebFluxConfigurer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(NotificationsApplication.class, args);
	}

}
