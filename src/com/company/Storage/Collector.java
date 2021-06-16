package com.company.Storage;

import com.company.Products.Product;
import com.company.Exceptions.CollectorFullException;

public interface Collector {
    void addProduct(Product product) throws CollectorFullException;
    void removeProduct(Product product);
    void clearCollector();
}
