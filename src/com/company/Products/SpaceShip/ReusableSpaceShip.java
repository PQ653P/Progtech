package com.company.Products.SpaceShip;

import com.company.Products.Product;

public class ReusableSpaceShip implements Product{
    private int price;
    public ReusableSpaceShip(int price){
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "It's a reusable spaceship";
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
