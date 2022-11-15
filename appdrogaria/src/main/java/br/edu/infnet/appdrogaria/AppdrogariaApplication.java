package br.edu.infnet.appdrogaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppdrogariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppdrogariaApplication.class, args);
	}

}
