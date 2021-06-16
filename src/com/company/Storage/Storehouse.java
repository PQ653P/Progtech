package com.company.Storage;

import com.company.Products.Product;
import com.company.Exceptions.CollectorFullException;

import java.util.ArrayList;
import java.util.List;

public class Storehouse implements Collector {
    private int maxItems = 200;
    private int numberOfItems = 0;
    private List<Product> products = new ArrayList<>();
    private static Storehouse instance;

    public static Storehouse getInstance() {
        if(instance == null) {
            instance = new Storehouse();
        }
        return instance;
    }

    @Override
    public void addProduct(Product product) throws CollectorFullException {
        if(numberOfItems >= maxItems) {
            throw new CollectorFullException("OOps the collector is full of products.!");
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
    public void clearCollector(){
        this.products = new ArrayList<>();
        this.numberOfItems = 0;
    }
}
