package com.zipcodewilmington.scientificcalculator;

public class CalculatorEngine {


    private Double result;

        public Double addition(Double valueOne, Double valueTwo){
            return result = valueOne + valueTwo;
        }
        public Double subtraction (Double valueOne, Double valueTwo) {
            return result = valueOne - valueTwo;
        }
        public Double multiply (Double valueOne, Double valueTwo) {
            return result = valueOne * valueTwo;
        }
        public Double divide (Double valueOne, Double valueTwo) {
            if (valueTwo != 0) {
                return result = valueOne / valueTwo;
            } else {
                return result = 0.0;
            }
        }


    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}
