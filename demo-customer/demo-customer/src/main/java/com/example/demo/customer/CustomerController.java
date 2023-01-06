package com.example.demo.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/customer")
public class CustomerController {

    @GetMapping
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
