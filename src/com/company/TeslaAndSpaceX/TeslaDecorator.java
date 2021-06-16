package com.company.TeslaAndSpaceX;

import com.company.Products.Product;

public abstract class TeslaDecorator implements Product {
    protected Product tempProduct;

    public TeslaDecorator(Product newProduct){
        tempProduct = newProduct;
    }

    public String getDescription(){
        return tempProduct.getDescription();
    }

    public int getPrice(){
        return tempProduct.getPrice();
    }
}
