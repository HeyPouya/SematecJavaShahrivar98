package com.sematec.lib;

import java.util.Scanner;

public class TestInputClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        System.out.println("Your age is : " + age);
    }
}
