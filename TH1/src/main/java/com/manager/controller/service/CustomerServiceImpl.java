package com.manager.controller.service;

import com.manager.controller.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> listCustomer;
    

    static {
        listCustomer = new HashMap<>();
        listCustomer.put(1, new Customer(1, "John", "john@codegym.vn", "Hanoi"));
        listCustomer.put(2, new Customer(2, "Bill", "bill@codegym.vn", "Danang"));
        listCustomer.put(3, new Customer(3, "Alex", "alex@codegym.vn", "Saigon"));
        listCustomer.put(4, new Customer(4, "Adam", "adam@codegym.vn", "Beijin"));
        listCustomer.put(5, new Customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
        listCustomer.put(6, new Customer(6, "Rose", "rose@codegym.vn", "Newyork"));
    }

    @Override
    public List<Customer> fillAll() {
        return new ArrayList<>(listCustomer.values());
    }

    @Override
    public void save(Customer customer) {
        listCustomer.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return listCustomer.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        listCustomer.put(id, customer);
    }

    @Override
    public void remove(int id) {
        listCustomer.remove(id);
    }
}
