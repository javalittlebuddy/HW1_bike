package com.ascending.blair;

public class Bike {

    private String name;
    private String wheelShape;
    private int wheelNum;
    private String seatShape;


    // constructor
    public Bike(String name, String wheelShape, int wheelNum, String seatShape){
        this.name = name;
        this.wheelShape = wheelShape;
        this.wheelNum = wheelNum;
        this.seatShape = seatShape;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWheelShape() {
        return wheelShape;
    }

    public void setWheelShape(String wheelShape) {
        this.wheelShape = wheelShape;
    }

    public int getWheelNum() {
        return wheelNum;
    }

    public void setWheelNum(int wheelNum) {
        this.wheelNum = wheelNum;
    }

    public String getSeatShape() {
        return seatShape;
    }

    public void setSeatShape(String seatShape) {
        this.seatShape = seatShape;
    }

    @Override
    public String toString() {
        return name + "'s wheel shape is " + wheelShape +
                ". It has " + wheelNum +
                " wheels and its seat shape is " + seatShape + ". ";
    }
}
