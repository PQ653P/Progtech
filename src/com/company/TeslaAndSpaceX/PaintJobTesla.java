package com.company.TeslaAndSpaceX;

import com.company.Products.Product;

public class PaintJobTesla extends TeslaDecorator{
    public PaintJobTesla(Product newProduct){
        super(newProduct);

        System.out.println("Adding Bodywork");

        System.out.println("Adding Paintjob");
    }

    public String getDescription(){
        return tempProduct.getDescription() + " + Paintjob";
    }

    public int getPrice(){
        return tempProduct.getPrice() + 100;
    }
}


