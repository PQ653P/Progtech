package com.company.Storage;

import com.company.Products.Product;

import com.company.Exceptions.CollectorFullException;
import java.util.ArrayList;
import java.util.List;

public class Cart implements Collector{

    private int maxItems = 10;
    private int numberOfItems = 0;
    private List<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product product) throws CollectorFullException {
        if(numberOfItems >= maxItems) {
            throw new CollectorFullException("This courier car is full!");
        }
        else {
            products.add(product);
            numberOfItems++;
        }
    }

    @Override
    public void removeProduct(Product product) {
        this.products.remove(product);
        this.numberOfItems--;
    }

    @Override
    public void clearCollector() {
        this.products = new ArrayList<>();
        this.numberOfItems = 0;
    }
}
