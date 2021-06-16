package com.company.CustomerOrder;

import com.company.Products.Product;
import com.company.TeslaAndSpaceX.*;

public class Preparation extends Order {

    public Preparation(Product product){
        super(product);
    }

    @Override
    void selfDrivingTesla() {
        product = new SelfDrivingTesla(product);
    }

    @Override
    void selfDrivingSpaceX() {
        product = new SelfDrivingSpaceX(product);
    }

    @Override
    void paintJobTesla() { product = new PaintJobTesla(product); }

    @Override
    void paintJobSpaceX() {
        product = new PaintJobSpaceX(product);
    }

    @Override
    void engineTesla() {
        product = new EngineTesla(product);
    }

    @Override
    void engineSpaceX() {
        product = new EngineSpaceX(product);
    }

    @Override
    public int getPrice() {
        return product.getPrice() + 5000;
    }

    @Override
    public String getDescription() {
        return product.getDescription();
    }
}
