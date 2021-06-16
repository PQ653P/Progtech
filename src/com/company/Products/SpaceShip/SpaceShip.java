package com.company.Products.SpaceShip;

import com.company.Products.Product;

public class SpaceShip implements Product {
    private int price;
    public SpaceShip(int price){
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "It's a spaceship";
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
