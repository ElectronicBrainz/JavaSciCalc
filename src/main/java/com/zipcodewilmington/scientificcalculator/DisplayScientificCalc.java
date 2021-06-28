package com.zipcodewilmington.scientificcalculator;

public class DisplayScientificCalc {
    private String value;
    private String memoryValue;

    public void setValue(String value){
        this.value = value;
    }
    public void display(){
        Console.println(getValue());
    }

    String getValue() {
        return this.value;
    }

    public void setMemoryValue(String value){
        this.memoryValue = value;
    }

    String getMemoryValue() {
        return this.memoryValue;
    }

}
