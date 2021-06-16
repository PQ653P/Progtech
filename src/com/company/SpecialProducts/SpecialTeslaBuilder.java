package com.company.SpecialProducts;

public class SpecialTeslaBuilder implements BuildSpecialTesla {
    private SpecialTesla tesla;

    public SpecialTeslaBuilder(){
        this.tesla = new SpecialTesla();
    }

    @Override
    public void buildWheelSize() {
        tesla.setWheelSize(19);
    }

    @Override
    public void buildEngines() {
        tesla.setNumberOfEngines(3);
    }

    @Override
    public void buildInterior() {
        tesla.setColorInInterior("Black and White");
    }

    @Override
    public void buildSeats() {
        tesla.setNumberOfSeats(5);
    }

    public SpecialTesla getSpecialTesla(){
        return this.tesla;
    }
}
