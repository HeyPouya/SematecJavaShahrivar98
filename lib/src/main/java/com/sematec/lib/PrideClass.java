package com.sematec.lib;

public class PrideClass extends ParentCar {

    @Override
    void startEngine() {
        System.out.println("Can't start the engine :(");
        System.out.println("Can't start the engine :(");
        System.out.println("Can't start the engine :(");
        System.out.println("Can't start the engine :(");
        super.startEngine();
    }

    @Override
    void moveCar() {
        super.moveCar();
        System.out.println("Car is moving very very slow");
    }

    @Override
    void stopCar() {
        System.out.println("Can't stop the car");
        System.out.println("Breaks are not working");
        System.out.println("I'm going to die");
        System.out.println("BOOOM!");
    }
}
