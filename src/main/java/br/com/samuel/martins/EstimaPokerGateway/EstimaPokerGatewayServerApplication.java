package br.com.samuel.martins.EstimaPokerGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EstimaPokerGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstimaPokerGatewayServerApplication.class, args);
	}

}

