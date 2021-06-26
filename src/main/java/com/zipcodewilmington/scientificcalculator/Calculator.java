package com.zipcodewilmington.scientificcalculator;


import java.util.Scanner;


/**
 * Created by leon on 2/9/18.
 */
public class Calculator {

 CalculatorEngine calcEngine = new CalculatorEngine();
 Boolean kill = true;

    public void run() {
        Console.println("Welcome to my calculator!");
        while (kill) {

        String operator = Console.getStringInput("Enter an Operator ( +, -, *, /, or Q to quit )");


        switch (operator) {
            case "Q":
                kill = false;
                break;

            case "+":
                calcEngine.addition(Console.getDoubleInput("Input First Value"), Console.getDoubleInput("Input Second Value"));
                Console.println(String.valueOf(calcEngine.getResult()));
                break;

            case "-":
                calcEngine.subtraction(Console.getDoubleInput("Input First Value"), Console.getDoubleInput("Input Second Value"));
                Console.println(String.valueOf(calcEngine.getResult()));
                break;

            case "*":
                calcEngine.multiply(Console.getDoubleInput("Input First Value"), Console.getDoubleInput("Input Second Value"));
                Console.println(String.valueOf(calcEngine.getResult()));
                break;

            case "/":
                calcEngine.divide(Console.getDoubleInput("Input First Value"), Console.getDoubleInput("Input Second Value"));
                Console.println(String.valueOf(calcEngine.getResult()));
                break;


        }
        }
        }

}
