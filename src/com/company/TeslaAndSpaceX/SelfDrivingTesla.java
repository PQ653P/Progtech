package com.company.TeslaAndSpaceX;

import com.company.Products.Product;

public class SelfDrivingTesla extends TeslaDecorator{
    public SelfDrivingTesla(Product newProduct){
        super(newProduct);

        System.out.println("Adding Self-Driving");
    }

    public String getDescription(){
        return tempProduct.getDescription() + " + Self-Driving";
    }

    public int getPrice(){
        return tempProduct.getPrice() + 200;
    }
}
