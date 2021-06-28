package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {



    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;


    }


    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);

        Integer userInput = 0;
        try {
            userInput = Integer.parseInt(scanner.nextLine());
        }
        catch (Exception e)
        {
            System.out.println("Enter a valid number!");
        }
        return userInput;
    }

    public static Double getDoubleInput(String prompt) {
       double userInput = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            println(prompt);
            userInput = Double.parseDouble(scanner.nextLine());

        } catch (Exception e) {
            Console.println("I thought I told you...");
            getDoubleInput("Input Number an actual number");

        }
        return userInput;
    }
}