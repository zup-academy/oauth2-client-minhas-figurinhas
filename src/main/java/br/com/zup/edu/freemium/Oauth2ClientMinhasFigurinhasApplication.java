package br.com.zup.edu.freemium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Oauth2ClientMinhasFigurinhasApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2ClientMinhasFigurinhasApplication.class, args);
	}

}
