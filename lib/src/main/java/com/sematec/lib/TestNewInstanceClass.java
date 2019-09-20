package com.sematec.lib;

import java.util.Scanner;

public class TestNewInstanceClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter the second number");
        int secondNumber = scanner.nextInt();

        CalculatorClass calc = new CalculatorClass();

        int sumResult = calc.sum(firstNumber, secondNumber);
        System.out.println("The sum is " + sumResult);

        int subResult = calc.sub(firstNumber, secondNumber);
        System.out.println("The sub is " + subResult);

    }
}
