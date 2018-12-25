package com.ascending.blair;

public class Bicycle extends Bike {

    private int pedalNum;

    public Bicycle(String name, String wheelShape, int wheelNum, String seatShape, int pedalNum){
        super(name, wheelShape, wheelNum, seatShape);
        this.pedalNum = pedalNum;
    }

    public int getPedalNum() {
        return pedalNum;
    }

    public void setPedalNum(int pedalNum) {
        this.pedalNum = pedalNum;
    }

    @Override
    public String toString() {
        return super.toString() +
                "It also has " + pedalNum + " pedals.";
    }
}
