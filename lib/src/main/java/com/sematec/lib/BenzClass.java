package com.sematec.lib;

public class BenzClass extends ParentCar {


    @Override
    void moveCar() {
        super.moveCar();
        System.out.println("Car is Moving very very faaaaaaast!");
    }
}
