package com.company.CustomerOrder;

import com.company.Exceptions.CollectorFullException;
import com.company.Exceptions.WrongOrderTypeException;
import com.company.Management.Observer;
import com.company.Products.Product;

public interface OrderFactory {
    Order createOrder(String type, Product product) throws CollectorFullException, WrongOrderTypeException;
    void attach(Observer observer);
    void notifyAllObservers();
}
