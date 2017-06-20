package com.nelavelli.notifications;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;


/**
 * 
 * @author Nelavelli Naresh
 *
 */
@SpringBootApplication
@EnableWebFlux
public class NotificationsApplication  extends SpringBootServletInitializer  implements WebFluxConfigurer  {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(NotificationsApplication.class, args);
	}

	/*@Override
	public void addCorsMappings(CorsRegistrym registry) {
		registry.addMapping("/cors/config");
	}*/
	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(applicationClass);
	    }

	    private static Class<NotificationsApplication> applicationClass = NotificationsApplication.class;

}
