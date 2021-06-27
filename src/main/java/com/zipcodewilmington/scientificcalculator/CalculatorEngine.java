package com.zipcodewilmington.scientificcalculator;

public class CalculatorEngine {


    private Double state;

        public Double addition(Double valueOne, Double valueTwo){
            return state = valueOne + valueTwo;
        }
        public Double subtraction (Double valueOne, Double valueTwo) {
            return state = valueOne - valueTwo;
        }
        public Double multiply (Double valueOne, Double valueTwo) {
            return state = valueOne * valueTwo;
        }
        public Double divide (Double valueOne, Double valueTwo) {
            if (valueTwo != 0) {
                return state = valueOne / valueTwo;
            } else {
                Console.println("Err - put in a real value, dummy");
                return state = 0.0;
            }
        }
        public Double squareRoot (Double valueOne) {
            return state = Math.sqrt(valueOne);
        }
        public Double square (Double valueOne) {
            return state = valueOne * valueOne;
        }
        public Double exponent (Double valueOne, Double valueTwo) {
            return state = Math.pow(valueOne, valueTwo);
        }
        public Double inverse (Double valueOne) {
            return state = 1/valueOne;
        }

    public Double getState() {
        return state;
    }

    public void setState(Double state) {
        this.state = state;
    }
}
