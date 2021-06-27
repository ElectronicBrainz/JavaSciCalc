package com.zipcodewilmington.scientificcalculator;

public class CalculatorEngine {

    PersonalFunctionality persFunc = new PersonalFunctionality();
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
                Console.println("Err - put in a real value, dummy");
                return result = 0.0;

            }
        }
        public Double squareRoot (Double valueOne) {
            return result = Math.sqrt(valueOne);
        }
        public Double square (Double valueOne) {
            return result = valueOne * valueOne;
        }
        public Double exponent (Double valueOne, Double valueTwo) {
            return result = Math.pow(valueOne, valueTwo);
        }
        public Double inverse (Double valueOne) {
            return result = 1/valueOne;
        }


    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}
