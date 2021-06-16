package com.company.Products.SpaceShip;

import com.company.Products.Product;

public class MoonWalker implements Product {
    private int price;

    public MoonWalker(int price){
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "It's a moonwalker";
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
