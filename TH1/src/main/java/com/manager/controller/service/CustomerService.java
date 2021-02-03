package com.manager.controller.service;

import com.manager.controller.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> fillAll();

    void save(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void remove(int id);
}
