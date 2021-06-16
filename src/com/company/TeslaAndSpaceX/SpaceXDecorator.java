package com.company.TeslaAndSpaceX;

import com.company.Products.Product;

public abstract class SpaceXDecorator implements Product {
    protected Product tempProduct;

    public SpaceXDecorator(Product newProduct){
        tempProduct = newProduct;
    }

    public String getDescription(){
        return tempProduct.getDescription();
    }

    public int getPrice(){
        return tempProduct.getPrice();
    }
}
