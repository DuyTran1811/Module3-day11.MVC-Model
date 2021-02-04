package com.managerSmatphone.controller.service;

import com.managerSmatphone.controller.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    private static Map<Integer, Product> products = new HashMap<>();

    static {
        products.put(1, new Product(1, "Nokia", 10000, "like New"));
        products.put(2, new Product(2, "Nokia", 200000, "like New"));
        products.put(3, new Product(3, "Nokia", 300000, "like New"));
        products.put(4, new Product(4, "Nokia", 400000, "like New"));
        products.put(5, new Product(5, "Nokia", 600000, "like New"));
        products.put(6, new Product(6, "Nokia", 800000, "like New"));
        products.put(7, new Product(7, "Nokia", 200000, "like New"));
        products.put(8, new Product(8, "Nokia", 234234, "like New"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList(products.values());
    }

    @Override
    public Product save(Product product) {
        return products.put(product.getId(), product);
    }

    @Override
    public Product update(int id, Product product) {
        return products.replace(id, product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void deleteById(int id) {
        products.remove(id);
    }
}
