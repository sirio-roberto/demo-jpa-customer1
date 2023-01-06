package com.example.demo.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class CustomerConfig {

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository repository) {
        return args -> {
            Customer joao = new Customer(
                    2L,
                    "Joao Silva",
                    "joao.silva@gmail.com",
                    "Seller",
                    LocalDate.of(1977, AUGUST, 16),
                    31);
            Customer sirius = new Customer(
                            "Sirius Junior",
                            "sirius@gmail.com",
                            "TSE",
                            LocalDate.of(1997, JULY, 12),
                            21);

            repository.saveAll(List.of(joao, sirius));
        };
    }
}
