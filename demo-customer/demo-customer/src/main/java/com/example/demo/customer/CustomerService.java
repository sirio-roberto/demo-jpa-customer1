package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class CustomerService {

    final private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public void insertCustomer(Customer customer) {
        if (customerRepository.existsById(customer.getId()))
            throw new IllegalStateException("Unexpected error! Id " + customer.getId() + " already exist in the database");
        customerRepository.save(customer);
    }
}
