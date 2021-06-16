package com.company.Products.Car;

import com.company.Products.Product;

public class Tesla implements Product {
    private int price;
    public Tesla(int price){
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "It's a Tesla car";
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
