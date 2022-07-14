package com.apple.springdataJPA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringDataJpaApplication.class, args);
  }

  @Bean
  CommandLineRunner commandLineRunner(ProductRepository productRepository) {
    return args -> {
      Product apple = new Product("Ipad", "Rocky", "rocky@gmail.com", 704);
      productRepository.save(apple);
    };
  }
}
