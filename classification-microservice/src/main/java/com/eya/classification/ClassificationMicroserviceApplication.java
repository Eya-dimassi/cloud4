package com.eya.classification;

import com.eya.classification.entities.Classification;
import com.eya.classification.repos.ClassificationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClassificationMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClassificationMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ClassificationRepository classificationRepository) {
        return args -> {

            classificationRepository.save(Classification.builder()
                    .className("Développé")
                    .classCode("PD")
                    .build());

            classificationRepository.save(Classification.builder()
                    .className("en Développement")
                    .classCode("PED")
                    .build());
        };
    }






}
