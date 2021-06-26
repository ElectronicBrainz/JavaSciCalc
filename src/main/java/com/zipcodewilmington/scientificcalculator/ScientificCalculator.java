package com.zipcodewilmington.scientificcalculator;

public class ScientificCalculator {
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
                trignometricResult = Math.toDegrees(Math.sin(input));
                break;
            case "tangent":
                trignometricResult = Math.tan(input);
                break;
            case "cosine":
                trignometricResult = Math.cos(input);
                break;
            case "inversesine":
                trignometricResult = Math.asin(input);
                break;
            case "inversetan":
                trignometricResult = Math.atan(input);
                break;
            case "inversecosine":
                trignometricResult = Math.acos(input);
                break;
        }
        result = String.valueOf(trignometricResult);
        if (inputMode == "degrees") {
            result = switchUnitsMode(inputMode, input);
        }

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
        return String.valueOf(result);
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


