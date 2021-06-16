package com.company.CustomerOrder;

import com.company.Products.Product;

public abstract class Order implements Product {
    Product product;

    public Order(Product product) {
        this.product = product;
    }

    public Product decorateProduct() {
        selfDrivingTesla();
        selfDrivingSpaceX();
        paintJobTesla();
        paintJobSpaceX();
        engineTesla();
        engineSpaceX();
        return product;
    }

    abstract void selfDrivingTesla();
    abstract void selfDrivingSpaceX();
    abstract void paintJobTesla();
    abstract void paintJobSpaceX();
    abstract void engineTesla();
    abstract void engineSpaceX();
}
