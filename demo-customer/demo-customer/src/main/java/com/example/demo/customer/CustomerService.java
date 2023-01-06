package com.example.demo.customer;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class CustomerService {


    public List<Customer> getCustomers() {
        return List.of(
                new Customer(
                        1L,
                        "Sirius Junior",
                        "sirius@gmail.com",
                        "TSE",
                        LocalDate.of(1997, Month.JULY, 12),
                        21),
                new Customer(
                        2L,
                        "Joao Silva",
                        "joao.silva@gmail.com",
                        "Seller",
                        LocalDate.of(1977, Month.AUGUST, 16),
                        31)
        );
    }
}
