package com.eya.pays;

import com.eya.pays.entities.Pays;
import com.eya.pays.repos.PaysRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableFeignClients
public class PaysApplication {

	public static void main(String[] args) {

		SpringApplication.run(PaysApplication.class, args);

    }
    @Bean
    CommandLineRunner commandLineRunner(PaysRepository paysRepository) {
        return args -> {

            paysRepository.save(Pays.builder()
                    .nomPays("Tunisie")
                    .continent("Afrique")
                    .classCode("PED")
                    .build());

            paysRepository.save(Pays.builder()
                    .nomPays("France")
                    .continent("Europe")
                    .classCode("PD")
                    .build());
        };
    }

        @Bean
        public WebClient webClient(){
            return WebClient.builder().build();
        }


}
