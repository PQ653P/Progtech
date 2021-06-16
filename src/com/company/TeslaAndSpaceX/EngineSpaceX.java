package com.company.TeslaAndSpaceX;

import com.company.Products.Product;

public class EngineSpaceX extends SpaceXDecorator{
    public EngineSpaceX(Product newProduct){
        super(newProduct);

        System.out.println("Adding Engine");
    }

    public String getDescription(){
        return tempProduct.getDescription() + " + Engine";
    }

    public int getPrice(){
        return tempProduct.getPrice() + 6000;
    }
}
