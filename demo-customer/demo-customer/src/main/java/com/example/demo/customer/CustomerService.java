package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        if (customerRepository.findByEmail(customer.getEmail()).isPresent()) {
            throw new IllegalStateException("Email was already taken");
        }
        customerRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        if (!customerRepository.existsById(id)) {
            throw new IllegalStateException("Customer with id = " + id + " does not exist");
        }
        customerRepository.deleteById(id);
    }

    @Transactional
    public void updateCustomer(Long id,
                               String name,
                               String email,
                               String job) {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Customer with id = " + id + " does not exist"));
        if (name != null
        && name.trim().length() > 0
        && !name.equals(customer.getName())) {
            customer.setName(name);
        }
        if (email != null
                && email.trim().length() > 0
                && !email.equals(customer.getEmail())) {
            if (customerRepository.findByEmail(email).isPresent()) {
                throw new IllegalStateException("Email was already taken");
            }
            customer.setEmail(email);
        }
        if (job != null
                && job.trim().length() > 0
                && !job.equals(customer.getJob())) {
            customer.setJob(job);
        }
    }
}
