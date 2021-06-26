package com.zipcodewilmington.scientificcalculator;


import java.util.Scanner;


/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {


    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");
        String s2 = Console.getSSI("Enter another string!");

        Console.println("The user input %s as their second string", s2);
        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);
        // This is where my code begins ---------------------------------------
/// temp code for clarity

/// end temp code
        int firstInt = Integer.parseInt(s);
        int secondInt = Integer.parseInt(s2);
        System.out.println(firstInt);

        String operator = Console.getStringInput("Enter an Operator ( +, -, *, / )");
        int resultInt = firstInt + secondInt; //TODO - fetch input from calculator object

        ///// eff this code :(


        switch (operator) {
            case "+":
                System.out.printf("%s + %s = %s", firstInt, secondInt, resultInt);
                break;

            case "-":
                System.out.printf("%.2f - %2.f = %2.f");
                break;

            case "*":
                System.out.printf("%.2f * %2.f = %2.f");
                break;

            case "/":
                if ( secondInt != 0) {
                    System.out.printf("%.2f / %2.f = %2.f");
               } else {
                    System.out.println("Err... Err...");
                    System.out.println("Pick a real number, you fool! Not zero!");

                }


                break;

        }


    }
}
