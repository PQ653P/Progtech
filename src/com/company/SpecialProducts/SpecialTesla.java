package com.company.SpecialProducts;

public class SpecialTesla implements SpecialTeslaPlan {

    private int wheelSizeInInch;
    private int numberOfEngines;
    private String colorInInterior;
    private int numberOfSeats;

    @Override
    public void setWheelSize(int wheelsize) {
        wheelSizeInInch = wheelsize;
    }

    public int GetWheelSize() {return wheelSizeInInch;}

    @Override
    public void setNumberOfEngines(int numofengines) {
        numberOfEngines = numofengines;
    }
    public int GetNumberOfEngines() {return numberOfEngines;}

    @Override
    public void setColorInInterior(String interiorcolor) {
        colorInInterior = interiorcolor;
    }
    public String GetColorInInterior() {return colorInInterior;}

    @Override
    public void setNumberOfSeats(int numofseats) {
        numberOfSeats = numofseats;
    }
    public int GetNumberOfSeats() {return numberOfSeats;}
}
