package com.company.TeslaAndSpaceX;

import com.company.Products.Product;

public class EngineTesla extends TeslaDecorator{
    public EngineTesla(Product newProduct){
        super(newProduct);

        System.out.println("Adding Engine");
    }

    public String getDescription(){
        return tempProduct.getDescription() + " + Engine";
    }

    public int getPrice(){
        return tempProduct.getPrice() + 500;
    }
}
