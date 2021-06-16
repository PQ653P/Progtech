package com.company.SpecialProducts;

public class SpecialTeslaEngineer {

    private SpecialTeslaBuilder specialTeslaBuilder;

    public SpecialTeslaEngineer(SpecialTeslaBuilder specialTeslaBuilder){

        this.specialTeslaBuilder = specialTeslaBuilder;
    }

    public SpecialTesla getSpecialTesla(){
        return this.specialTeslaBuilder.getSpecialTesla();
    }

    public void makeTesla(){
        this.specialTeslaBuilder.buildWheelSize();
        this.specialTeslaBuilder.buildEngines();
        this.specialTeslaBuilder.buildInterior();
        this.specialTeslaBuilder.buildSeats();
    }
}
