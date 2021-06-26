package com.zipcodewilmington.scientificcalculator;


import java.util.Scanner;


/**
 * Created by leon on 2/9/18.
 */
public class Calculator {


    public void run() {
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


        ///// eff this code :(

        Integer resultInt = null;
        switch (operator) {
            case "+":
                resultInt = firstInt + secondInt; //TODO - fetch output from calculator engine
                System.out.printf("%s + %s = %s", firstInt, secondInt, resultInt);
                break;

            case "-":
                resultInt = firstInt - secondInt; //TODO - fetch output from calculator engine
                System.out.printf("%s - %s = %s", firstInt, secondInt, resultInt);
                break;

            case "*":
                resultInt = firstInt * secondInt; //TODO - fetch output from calculator engine
                System.out.printf("%s * %s = %s", firstInt, secondInt, resultInt);
                break;

            case "/":
                resultInt = firstInt / secondInt; //TODO - fetch output from calculator engine
                if ( secondInt != 0) {
                    System.out.printf("%s / %s = %s", firstInt, secondInt, resultInt);
                } else {
                    System.out.println("Err... Err...");
                    System.out.println("Pick a real number, you fool! Not zero!");

                }


                break;

        }


    }
}