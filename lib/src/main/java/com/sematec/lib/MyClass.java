package com.sematec.lib;

public class MyClass {


    public static void main(String[] args) {

        printWelcome();
        printName("Pouya");
        int powerResult = power(2);
        System.out.println(powerResult);

        double divResult = div(10, 2);
        System.out.println(divResult);


        double doubleDivResult = doubleDiv(4, 3);
        System.out.println(doubleDivResult);
    }

    int a = 14;
    double d = 3.14;
    boolean b = false;
    String name = "Pouya";
    long l = 1000;
    short s = 50;
    float f = 3.14f;


    int number;
    double myNumber;
    float myNiceFloatNumber;


    static int power(int x) {

        int result = x * x;
        return result;
    }

    static double div(int x, int y) {
        int result = x / y;
        return result;
    }

    double div1(int x, int y) {
        double result = x / y;
        return result;
    }

    static double doubleDiv(double x, double y) {
        return x / y;
    }

    String welcome() {
        String s = "Welcome";
        return s;
    }

    static void printName(String name) {
        System.out.println(name);
    }

    static void printWelcome() {
        System.out.println("Welcome");
    }


    //      /       slash
    //      \       back slash
    //      { }     curly brace
    //      []      brace
    //      -       dash
    //      _       underline
    //      #       sharp
    //      ()      parantez
    //      &       ampersand
    //      |       pipe line
    //      "       double quotation
    //      '       single quotation
    //      :       colon
    //      ;       semicolon
    //      ,       comma
    //      ~       tilda

}
