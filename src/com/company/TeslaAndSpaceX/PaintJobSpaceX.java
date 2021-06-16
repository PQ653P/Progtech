package com.company.TeslaAndSpaceX;

import com.company.Products.Product;

public class PaintJobSpaceX extends SpaceXDecorator{
    public PaintJobSpaceX(Product newProduct){
        super(newProduct);

        System.out.println("Adding Bodywork");

        System.out.println("Adding Paintjob");
    }

    public String getDescription(){
        return tempProduct.getDescription() + " + Paintjob";
    }

    public int getPrice(){
        return tempProduct.getPrice() + 1000;
    }
}
