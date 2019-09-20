package com.sematec.lib;

public class TestIfClass {


    public static void main(String[] args) {
        int age = 18;

        if (age > 18) {
            System.out.println("Age is greater than 18");
        }

        if (age >= 18) {
            System.out.println("Age is greater than or equal to 18");
        }

        if (age == 18) {
            System.out.println("Age equals 18");
        }

        if (age != 18) {
            System.out.println("Age is not equals to 18");
        }


        int a = 20;
        int b = 20;


        int c = 3;
        if (a < b) {
            System.out.println("b is greater than a");
        } else if (b > a) {
            System.out.println("a is greater than b");
        } else if (a == b) {
            System.out.println("a equals b");
        } else if (a >= b) {
            System.out.println("a is greater than or equals b");
        }


    }


}
