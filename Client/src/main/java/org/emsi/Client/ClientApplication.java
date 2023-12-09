package org.emsi.Client;

import org.emsi.Client.Model.client;
import org.emsi.Client.Repository.clientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

	@Bean
	CommandLineRunner initialiserBaseH2(clientRepository ClientRepository) {
		return args -> {
			ClientRepository.save(new client(Long.parseLong("1"), "Rabab FAHSSI", Float.parseFloat("23")));
			ClientRepository.save(new client(Long.parseLong("2"), "Houda EL KORAINI", Float.parseFloat("22")));
			ClientRepository.save(new client(Long.parseLong("3"), "Saad BAKANZIZE", Float.parseFloat("22")));

		};
	}


}
