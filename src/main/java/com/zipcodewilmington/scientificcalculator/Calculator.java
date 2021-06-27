package com.zipcodewilmington.scientificcalculator;


import java.util.Scanner;


/**
 * Created by leon on 2/9/18.
 */
public class Calculator {

 CalculatorEngine calcEngine = new CalculatorEngine();
 Boolean kill = false;

    public void run() {
        Console.println("Welcome to my calculator!");
        while (!kill) {

        String operator = Console.getStringInput("Enter an Operator ( +, -, *, /, SquareRoot, Square, Exponent, Inverse or Q to quit )");


        switch (operator) {
            case "Q":
                kill = true;
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

            case "SquareRoot":
                calcEngine.squareRoot(Console.getDoubleInput("Input First Value"));
                Console.println(String.valueOf(calcEngine.getResult()));
                break;

            case "Square":
                calcEngine.square(Console.getDoubleInput("Input First Value"));
                Console.println(String.valueOf(calcEngine.getResult()));
                break;

            case "Exponent":
                calcEngine.exponent(Console.getDoubleInput("Input First Value"), Console.getDoubleInput("Input Second Value"));
                Console.println(String.valueOf(calcEngine.getResult()));
                break;

            case "Inverse":
                calcEngine.inverse(Console.getDoubleInput("Input First Value"));
                Console.println(String.valueOf(calcEngine.getResult()));
                break;
        }
        }
        }

}
