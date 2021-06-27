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


