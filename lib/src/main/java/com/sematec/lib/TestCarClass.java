package com.sematec.lib;

public class TestCarClass {

    public static void main(String[] args) {

        BMWClass bmw = new BMWClass();
        bmw.startEngine();
        bmw.moveCar();
        bmw.stopCar();

        BenzClass benz = new BenzClass();
        benz.startEngine();
        benz.moveCar();
        benz.stopCar();

        PrideClass pride = new PrideClass();
        pride.startEngine();
        pride.moveCar();
        pride.stopCar();
    }
}
