package com.payment.stripe_integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = {"com.payment.stripe_integration.*","org.springdoc"})
public class StripeIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StripeIntegrationApplication.class, args);
	}

}

