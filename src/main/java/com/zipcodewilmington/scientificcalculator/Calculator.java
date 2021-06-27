package com.zipcodewilmington.scientificcalculator;


/**
 * Created by leon on 2/9/18.
 */
public class Calculator {

    CalculatorEngine calcEngine = new CalculatorEngine();
    PersonalFunctionality persFunc = new PersonalFunctionality();
    CalculatorDisplay display = new CalculatorDisplay();
    Boolean kill = false;

    public void run() {
        Console.println("Welcome to my calculator!");
        Console.println("Current Value is 0");
        while (!kill) {

            String operator = Console.getStringInput("Enter an Operator ( +, -, *, /, SquareRoot, Square, Exponent, Inverse or Q to quit (What's Downtown?)" + "\n" + "Enter C to clear the display!");

            switch (operator) {
                case "Q":
                    kill = true;
                    break;

                case "+":
                    calcEngine.addition(Console.getDoubleInput("Input First Value"), Console.getDoubleInput("Input Second Value"));
                    Console.println(String.valueOf(calcEngine.getState()));
                    break;

                case "-":
                    calcEngine.subtraction(Console.getDoubleInput("Input First Value"), Console.getDoubleInput("Input Second Value"));
                    Console.println(String.valueOf(calcEngine.getState()));
                    break;

                case "*":
                    calcEngine.multiply(Console.getDoubleInput("Input First Value"), Console.getDoubleInput("Input Second Value"));
                    Console.println(String.valueOf(calcEngine.getState()));
                    break;

                case "/":
                    calcEngine.divide(Console.getDoubleInput("Input First Value"), Console.getDoubleInput("Input Second Value"));
                    Console.println(String.valueOf(calcEngine.getState()));
                    break;

                case "SquareRoot":
                    calcEngine.squareRoot(Console.getDoubleInput("Input First Value"));
                    Console.println(String.valueOf(calcEngine.getState()));
                    break;

                case "Square":
                    calcEngine.square(Console.getDoubleInput("Input First Value"));
                    Console.println(String.valueOf(calcEngine.getState()));
                    break;

                case "Exponent":
                    calcEngine.exponent(Console.getDoubleInput("Input First Value"), Console.getDoubleInput("Input Second Value"));
                    Console.println(String.valueOf(calcEngine.getState()));
                    break;

                case "Inverse":
                    calcEngine.inverse(Console.getDoubleInput("Input First Value"));
                    Console.println(String.valueOf(calcEngine.getState()));
                    break;

                case "What's Downtown?":
                    Console.println(persFunc.song());
                    break;

                case "C":
                    Console.println("                                                         "
                            + "\n" + "                                                         "
                            + "\n" + "                                                         "
                            + "\n" + "                                                         "
                            + "\n" + "                                                         "
                            + "\n" + "                                                         "
                            + "\n" + "                                                         "
                            + "\n" + "                                                         "
                            + "\n" + "                                                         "
                            + "\n" + "                                                         "
                            + "\n" + "                                                         "
                            + "\n" + "                                                         "
                            + "\n" + "                                                         "
                            + "\n" + "                                                         "
                            + "\n" + "                                                         "
                            + "\n" + "                                                         "
                            + "\n" + "                                                         "
                            + "\n" + "                                                         "
                            + "\n" + "                                                         "
                            + "\n" + "                                                         "
                            + "\n" + "                                                         "
                            + "\n" + "                                                         "
                            + "\n");
                    break;
            }
        }
    }

}
