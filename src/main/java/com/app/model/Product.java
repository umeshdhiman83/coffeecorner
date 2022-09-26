package com.app.model;

public class Product {
    String name;
    Float price;
    String size;
    String description;

    public Product(String name, String size, Float price, String description) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.description = description;
    }

    public Product(String name, Float price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.size = "NA";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return " | " + String.format("%25s", name) + " | " + String.format("%15s", price) + " | " + String.format("%15s", size) + " | " + String.format("%5s", description);
    }
}
