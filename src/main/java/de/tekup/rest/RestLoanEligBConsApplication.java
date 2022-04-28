package de.tekup.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RestLoanEligBConsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestLoanEligBConsApplication.class, args);
	}

}
