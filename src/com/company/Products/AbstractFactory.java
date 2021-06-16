package com.company.Products;

import com.company.Exceptions.FactoryNotExistException;
import com.company.Products.Car.CarProductFactory;
import com.company.Products.SpaceShip.SpaceShipProductFactory;

public class AbstractFactory {
    public static ProductFactory getProductFactory(String name) throws FactoryNotExistException {
        ProductFactory productFactory;
        if (name.equalsIgnoreCase("cars")) {
            productFactory = CarProductFactory.getInstance();
        } else if (name.equalsIgnoreCase("spaceship")) {
            productFactory = SpaceShipProductFactory.getInstance();
        } else throw new FactoryNotExistException("Not existing type of factory!");

        return productFactory;
    }
}
