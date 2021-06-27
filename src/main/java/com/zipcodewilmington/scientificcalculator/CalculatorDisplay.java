package com.zipcodewilmington.scientificcalculator;

public class CalculatorDisplay {

    CalculatorEngine calcEngine = new CalculatorEngine();

    public static Double currentValue() {
        CalculatorEngine calcEngine = new CalculatorEngine();
        Double currentDisplay = calcEngine.getResult();
        return currentDisplay;
    }


}