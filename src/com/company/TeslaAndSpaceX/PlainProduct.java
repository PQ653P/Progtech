package com.company.TeslaAndSpaceX;

import com.company.Products.Product;

public class PlainProduct implements Product {

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Bodywork";
    }
}
