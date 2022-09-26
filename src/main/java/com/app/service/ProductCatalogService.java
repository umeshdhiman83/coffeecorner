package com.app.service;

import com.app.model.Product;

import java.util.Map;
import java.util.TreeMap;

public class ProductCatalogService {
    TreeMap<Integer, Product> catalog = new TreeMap<Integer, Product>();

    public ProductCatalogService() {
        getProductCatalog();
    }

    public Map<Integer, Product> getProductCatalog() {
        catalog.put(1, new Product("Coffee", "Regular", new Float(2.50), "  Ex. Milk 0.30 CHF, Foamed milk 0.50 CHF"));
        catalog.put(2, new Product("Coffee", "Small", new Float(2.50), "  Ex. Milk 0.30 CHF, Foamed milk 0.50 CHF"));
        catalog.put(3, new Product("Coffee", "Medium", new Float(3.00), "  Ex. Milk 0.30 CHF, Foamed milk 0.50 CHF"));
        catalog.put(4, new Product("Coffee", "Large", new Float(3.50), "  Ex. Milk 0.30 CHF, Foamed milk 0.50 CHF"));
        catalog.put(5, new Product("Bacon Roll", new Float(4.50), "Hot/Cold"));
        catalog.put(6, new Product("Orange Juice", new Float(3.95), "   Freshly squeezed"));
        catalog.put(7, new Product("Extra milk", new Float(0.30), "-"));
        catalog.put(8, new Product("Foamed milk", new Float(0.50), "-"));
        catalog.put(9, new Product("Special roast coffee", new Float(0.90), "-"));
        return catalog;
    }

    public void displayMenu() {

        System.out.println("Enter Item Number To Complete The Order");
        System.out.println(String.format("%15s", "Item No") + String.format("%25s", "Name") + String.format("%18s", "Price") + String.format("%15s", "Size") + String.format("%25s", "Description"));
        getProductCatalog().entrySet().forEach(entry -> {
            System.out.println(String.format("%15s", entry.getKey()) + " " + entry.getValue());
        });
    }
}
