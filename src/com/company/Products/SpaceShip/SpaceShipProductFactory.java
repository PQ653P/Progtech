package com.company.Products.SpaceShip;

import com.company.Exceptions.ProductNotExistException;
import com.company.Products.Product;
import com.company.Products.ProductFactory;

public class SpaceShipProductFactory implements ProductFactory{
    private SpaceShipProductFactory() {}
    private static SpaceShipProductFactory instance;

    public static SpaceShipProductFactory getInstance() {
        if (instance == null) {
            instance = new SpaceShipProductFactory();
        }
        return instance;
    }

    @Override
    public Product createProduct(String name, int price) throws ProductNotExistException {
        Product product;
        if(name.equalsIgnoreCase("spaceship")) {
            product = new SpaceShip(price);
        }
        else if(name.equalsIgnoreCase("moonwalker")) {
            product = new MoonWalker(price);
        }
        else if(name.equalsIgnoreCase("reusablespaceship")) {
            product = new ReusableSpaceShip(price);
        }
        else throw new ProductNotExistException("This product doesn't exist!");

        return product;
    }
}
