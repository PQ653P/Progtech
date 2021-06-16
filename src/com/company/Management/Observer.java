package com.company.Management;

import com.company.CustomerOrder.Order;

public abstract class Observer {
    protected Order order;
    public abstract void update();
}
