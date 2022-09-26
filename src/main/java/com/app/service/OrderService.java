package com.app.service;

import com.app.model.Product;

import java.util.Map;
import java.util.TreeMap;

public class OrderService {

    Map<Integer, Product> order = new TreeMap<>();

    public void addItemToCustomerOrder(Integer productId, Product product) {
        order.put(productId, product);
    }

    public Map<Integer, Product> getCustomerOrder() {
        return order;
    }

}
