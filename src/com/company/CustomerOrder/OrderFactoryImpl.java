package com.company.CustomerOrder;

import com.company.Management.Observer;
import com.company.Products.Product;
import com.company.Storage.Cart;
import com.company.Storage.Collector;
import com.company.Exceptions.CollectorFullException;
import com.company.Exceptions.WrongOrderTypeException;

import java.util.ArrayList;
import java.util.List;

public class OrderFactoryImpl implements OrderFactory {
    public static List<Cart> carts = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();
    private int ID = 0;
    Collector storehouse;

    public OrderFactoryImpl(Collector storehouse) {
        carts.add(new Cart());
        this.storehouse = storehouse;
        ID++;
    }

    @Override
    public Order createOrder(String type, Product product) throws CollectorFullException, WrongOrderTypeException {
        Order order;
        if(type.equalsIgnoreCase("delivery")) {
            order = new Preparation(product);
            carts.get(ID - 1).addProduct(order);
            storehouse.removeProduct(product);
            notifyAllObservers();
        }
        else throw new WrongOrderTypeException("This type of order doesn't exist!");

        return order;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
