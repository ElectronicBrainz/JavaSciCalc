package com.zipcodewilmington.scientificcalculator;

public class DisplayScientificCalc {
    private String value;

    public void setValue(String value){
        this.value = value;
    }
    public void display(){
        Console.println(getValue());
    }

    String getValue() {
        return this.value;
    }

}
