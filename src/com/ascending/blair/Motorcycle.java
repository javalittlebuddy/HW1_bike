package com.ascending.blair;

public class Motorcycle extends Bike {

    private int pedalNum;
    private int gasTank;
    private String motor;

    public Motorcycle(String name, String wheelShape, int wheelNum, String seatShape, int pedalNum, int gasTank, String motor){
        super(name, wheelShape, wheelNum, seatShape);
        this.pedalNum = pedalNum;
        this.gasTank = gasTank;
        this.motor = motor;
    }

    public int getPedalNum() {
        return pedalNum;
    }

    public void setPedalNum(int pedalNum) {
        this.pedalNum = pedalNum;
    }

    public int getGasTank() {
        return gasTank;
    }

    public void setGasTank(int gasTank) {
        this.gasTank = gasTank;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return super.toString() +
                "It also has " + pedalNum + " pedals with gas tank of " +
                gasTank + " gal and " + motor + " motor.";
    }
}
