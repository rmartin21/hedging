package com.abbvie.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;

// TODO: Auto-generated Javadoc
/**
 * The Class PackMicroserviceApplication.
 */
@SpringBootApplication(scanBasePackages = {"com.abbvie"})
@Configuration
@EnableAutoConfiguration
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HistMicroserviceApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(HistMicroserviceApplication.class, args);
	}

}
