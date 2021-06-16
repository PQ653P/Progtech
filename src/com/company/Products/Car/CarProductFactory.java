package com.company.Products.Car;

import com.company.Exceptions.ProductNotExistException;
import com.company.Products.Product;
import com.company.Products.ProductFactory;

public class CarProductFactory implements ProductFactory{
    private CarProductFactory() {}
    private static CarProductFactory instance;

    public static CarProductFactory getInstance() {
        if (instance == null) {
            instance = new CarProductFactory();
        }
        return instance;
    }

    @Override
    public Product createProduct(String name, int price) throws ProductNotExistException {
        Product product;
        if(name.equalsIgnoreCase("tesla")) {
            product = new Tesla(price);
        }
        else throw new ProductNotExistException("This product doesn't exist!");

        return product;
    }
}
