package com.sematec.lib;

public class TestStringsClass {

    public static void main(String[] args) {
        String name = "Pouya";


        if (name.contains("o")) {
            System.out.println("contains o");
        }

        if (name.equalsIgnoreCase("pouya")) {
            System.out.println("they are equal");
        }

        if (name.equals("Qoli")){
            System.out.println("its Qoli!");
        }

        if (name == "Qoli"){

        }

    }
}
