package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[]args)
    {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        Scanner scanner = new Scanner(System.in);
        DisplayScientificCalc displayScientificCalc = new DisplayScientificCalc();
        Boolean exitProgram = false;
        Integer number =0;
         System.out.println("Welcome to my scientific calculator!!");
        do {
            number = Console.getIntegerInput("Enter number:\n");
            Integer inMemory = 0;
            String options = Console.getStringInput("Choose an option from the following: \n " +
                    "Press m - M+ Save in memory \n " +
                    "Press c - Mc Reset Memory \n" +
                    "Press r - Mrc Recall Current Memory \n" +
                    "Press f - To find factorial of number \n" +
                    "Press l - To find logarithm functions of number \n" +
                    "Press e = To exit calculator");
            switch (options) {
                case "m":
                    inMemory = number;
                    System.out.println("Stored in memory");
                    break;
                case "c":
                    inMemory = 0;
                    System.out.println("Value cleared");
                    break;
                case "r":
                    System.out.println("Value recalled - " + number);
                    break;
                case "f":
                    System.out.println("The factorial of " + number + " is:" + scientificCalculator.factorialFunction(number));
                    break;
                case "l":
                    String optionsForLog = Console.getStringInput("Choose an option from the following: \n " +
                            "Press l - Find log \n " +
                            "Press i - Find inverse log \n" +
                            "Press n - Find natural log \n" +
                            "Press u - Inverse natural log \n");
                    switch(optionsForLog)
                    {
                        case "l":
                            displayScientificCalc.setValue(scientificCalculator.logarithmicFunctions("log",number));
                            break;
                        case "i":
                            displayScientificCalc.setValue(scientificCalculator.logarithmicFunctions("inverse log",number));
                            break;
                        case "n":
                            displayScientificCalc.setValue(scientificCalculator.logarithmicFunctions("natural log",number));
                            break;
                        case "u":
                            displayScientificCalc.setValue(scientificCalculator.logarithmicFunctions("inverse natural log",number));
                            break;
                    }
                    System.out.println("The Log value of " + number + " is:" + displayScientificCalc.getValue());
                    break;

                case "e":
                    System.out.println("GoodBye!!");
                    exitProgram = true;
                    break;
                default:
                    System.out.println("Not a valid input!");
                    break;
            }
        }
        while(!exitProgram);

    }
    public String switchDisplayMode(String options) {

        return options;
    }

    public String DisplayMode(String mode, Integer input) {
        String displayMode = "";
        switch (mode) {
            case "binary":
                displayMode = Integer.toBinaryString(input);
                break;
            case "octal":
                displayMode = Integer.toOctalString(input);
                break;
            case "decimal":
                displayMode = String.valueOf(input);
                break;
            case "hexadecimal":
                displayMode = Integer.toHexString(input);
                break;
        }
        return displayMode;
    }

    public String switchUnitsMode(String options) {

        return options;
    }

    public String switchUnitsMode(String mode, double input) {
        String displayMode = "";
        switch (mode) {
            case "degrees":
                displayMode = String.valueOf(Math.toDegrees(input));
                break;
            case "radians":
                displayMode = String.valueOf(Math.toRadians(input));
                break;
        }
        return displayMode;
    }

    public String trigonometricFunctions(String mode, double input, String inputMode) {
        double trignometricResult = 0;
        String result = "";
        switch (mode) {
            case "sine":
                if(inputMode == "degrees")
                    trignometricResult = Math.sin(Math.toRadians(input));
                else
                    trignometricResult = Math.sin(input);
                break;
            case "tangent":
                if(inputMode == "degrees")
                    trignometricResult = Math.tan(Math.toRadians(input));
                else
                    trignometricResult = Math.tan(input);
                break;
            case "cosine":
                if(inputMode == "degrees")
                    trignometricResult = Math.cos(Math.toRadians(input));
                else
                    trignometricResult = Math.cos(input);
                break;
            case "inversesine":
                if(inputMode == "degrees")
                    trignometricResult = Math.toDegrees(Math.asin(input));
                else
                    trignometricResult = Math.asin(input);
                break;
            case "inversetan":
                if(inputMode == "degrees")
                    trignometricResult = Math.toDegrees(Math.atan(input));
                else
                    trignometricResult = Math.atan(input);
                break;
            case "inversecosine":
                if(inputMode == "degrees")
                    trignometricResult = Math.toDegrees(Math.acos(input));
                else
                    trignometricResult = Math.acos(input);
                break;
        }
        result = String.valueOf(trignometricResult);

        return result;
    }

    public String logarithmicFunctions(String mode, Integer input) {
        double result = 0;
        Long resultInverseLog = 0l;
        switch (mode) {
            case "natural log":
                result = Math.log(input);
                break;
            case "inverse log":
                result = Math.pow(10,input);
                break;
            case "log":
             result = Math.log10(input);
            break;
            case "inverse natural log":
             result = Math.exp(input);
            break;
        }
        return String.format("%.9f",result);
    }

    public Integer factorialFunction(Integer input) {
        Integer factorial=0;

        if (input == 0) {
            factorial = 1;
        }
        else if(input>0)
         {
            factorial = input * factorialFunction(input - 1);
        }
        return factorial;
    }

}


