package com.zipcodewilmington.scientificcalculator;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class ScientificCalculator {
    public static void main(String[]args)
    {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        DisplayScientificCalc displayScientificCalc = new DisplayScientificCalc();
        Boolean exitProgram = false;
        Boolean isValueRecalled = false;
        Integer number =0;
         System.out.println("Welcome to my scientific calculator!!");
        do {
            if(!isValueRecalled) {
                number = Console.getIntegerInput("Enter number:");
            }
            else {
                number = Integer.valueOf(displayScientificCalc.getMemoryValue());
                isValueRecalled = false;
            }
            String options = Console.getStringInput("Choose an option from the following: \n " +
                    "Press m - M+ Save in memory \n " +
                    "Press c - Mc Reset Memory \n" +
                    "Press r - Mrc Recall Current Memory \n" +
                    "Press f - To find factorial of number \n" +
                    "Press l - To find logarithm functions of number \n" +
                    "Press t - To find Trigonometric functions of number \n" +
                    "Press d - To switch between binary,octal,hexadecimal and decimal \n" +
                    "Press a - To find eulers value for a value \n" +
                    "Press b - To find ulp value for a value \n" +
                    "Press e = To exit calculator");
            switch (options) {
                case "m":
                    displayScientificCalc.setMemoryValue(String.valueOf(number));
                    System.out.println(displayScientificCalc.getMemoryValue()+" is Stored in memory");
                    break;
                case "c":
                    displayScientificCalc.setMemoryValue("");
                    System.out.println("Value cleared");
                    break;
                case "r":
                    isValueRecalled = true;
                    System.out.println("Value recalled - " + displayScientificCalc.getMemoryValue());
                    break;
                case "a":
                    displayScientificCalc.setValue(scientificCalculator.customFeatureGetEulersValue(number));
                    System.out.println("The Eulers value for "+number+" is:"+displayScientificCalc.getValue());
                    break;
                case "b":
                    displayScientificCalc.setValue(scientificCalculator.customFeatureGetUlpValue(number));
                    System.out.println("The Ulp value for "+number+" is:"+displayScientificCalc.getValue());
                    break;
                case "d":
                    Boolean exitConversion = false;

                    do {
                        String optionsForConversionFunction = Console.getStringInput("Choose an option from the following: \n " +
                                "Press b - Find binary \n " +
                                "Press o - Find octal \n" +
                                "Press h - Find hexadecimal \n" +
                                "Press d - Find decimal \n" +
                                "Press e - to Exit \n");
                        switch (optionsForConversionFunction) {
                            case "b":
                                displayScientificCalc.setValue(scientificCalculator.conversionFunction("binary", number));
                                break;
                            case "o":
                                displayScientificCalc.setValue(scientificCalculator.conversionFunction("octal", number));
                                break;
                            case "h":
                                displayScientificCalc.setValue(scientificCalculator.conversionFunction("hexadecimal", number));
                                break;
                            case "d":
                                displayScientificCalc.setValue(scientificCalculator.conversionFunction("decimal", number));
                                break;
                            case "e":
                                exitConversion = true;
                                break;
                        }
                        if(!exitConversion)
                            System.out.println("The value of " + number + " is:" + displayScientificCalc.getValue());
                        else
                            System.out.println("Exited from conversions");
                    }
                    while(!exitConversion);
                    break;

                case "f":
                    System.out.println("The factorial of " + number + " is:" + scientificCalculator.factorialFunction(number));
                    break;
                case "t":
                    Boolean exitTrig = false;
                    String inputMode = "";
                    String optionsForTrigonometricFunction = "";
                    do {
                        inputMode = Console.getStringInput("Choose if input mode should be r - radians or d - degrees" +
                                "Default value is in degrees.");
                        if (inputMode == "r")
                            inputMode = "radians";
                        else
                            inputMode = "degrees";

                        optionsForTrigonometricFunction = Console.getStringInput("Choose an option from the following: \n " +
                                "Press s - Find sine \n " +
                                "Press c - Find cosine \n" +
                                "Press t - Find tangent \n" +
                                "Press i - Find inverse sine \n" +
                                "Press o - Find inverse cosine \n" +
                                "Press a - Find inverse tangent \n"+
                                "Press e - To exit \n");

                        switch (optionsForTrigonometricFunction) {
                            case "s":
                                optionsForTrigonometricFunction = "sine";
                                displayScientificCalc.setValue(scientificCalculator.trigonometricFunctions(optionsForTrigonometricFunction, number, inputMode));
                                break;
                            case "c":
                                displayScientificCalc.setValue(scientificCalculator.trigonometricFunctions("cosine", number, inputMode));
                                break;
                            case "t":
                                displayScientificCalc.setValue(scientificCalculator.trigonometricFunctions("tangent", number, inputMode));
                                break;
                            case "i":
                                displayScientificCalc.setValue(scientificCalculator.trigonometricFunctions("inversesine", number, inputMode));
                                break;
                            case "o":
                                displayScientificCalc.setValue(scientificCalculator.trigonometricFunctions("inversecosine", number, inputMode));
                                break;
                            case "a":
                                displayScientificCalc.setValue(scientificCalculator.trigonometricFunctions("inversetan", number, inputMode));
                                break;
                            case "e":
                                exitTrig = true;
                                break;
                        }
                        System.out.println("The "+inputMode+" value of "+optionsForTrigonometricFunction+ " is:"+displayScientificCalc.getValue());
                    }while(!exitTrig);
                    if(exitTrig)
                        System.out.println("Exited from Trigonometric functions");
                    break;
                case "l":
                    String optionsForLog = Console.getStringInput("Choose an option from the following: \n " +
                            "Press l - Find log \n " +
                            "Press i - Find inverse log \n" +
                            "Press n - Find natural log \n" +
                            "Press u - Find Inverse natural log \n");
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

    public String conversionFunction(String mode, Integer input) {
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
        Integer factorial;

        if (input == 0) {
            factorial = 1;
        }
        else if(input>0)
         {
            factorial = input * factorialFunction(input - 1);
        }
        else
        {
            factorial = 0;
        }
        return factorial;
    }

    public String customFeatureGetEulersValue(Integer input){
        String result = String.valueOf(Math.exp(input));
        return result;
    }
    public String customFeatureGetUlpValue(Integer input){
        String result = String.valueOf(Math.ulp(input));
        return result;
    }

}



