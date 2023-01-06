package com.example.demo.customer;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

public class Customer {
    private Long id;
    private String name;
    private String email;
    private String job;
    private LocalDate birthDate;
    private Integer age;

    public Customer() {
    }

    public Customer(Long id, String name, String email, String job, LocalDate birthDate, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.job = job;
        this.birthDate = birthDate;
        this.age = age;
    }

    public Customer(String name, String email, String job, LocalDate birthDate, Integer age) {
        this.name = name;
        this.email = email;
        this.job = job;
        this.birthDate = birthDate;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", job='" + job + '\'' +
                ", birthDate=" + birthDate +
                ", age=" + age +
                '}';
    }
}
