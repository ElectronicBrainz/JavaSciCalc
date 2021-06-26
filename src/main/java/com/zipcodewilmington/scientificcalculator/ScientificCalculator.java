package com.zipcodewilmington.scientificcalculator;

public class ScientificCalculator {
    public String switchDisplayMode(String options){

        return options;
    }
    public String DisplayMode(String mode){
        String displayMode = "";
        Integer i = 0 ;
        switch(mode){
            case "binary":
                displayMode = i.toBinaryString(0);
                break;
            case "octal":
                displayMode = i.toOctalString(0);
                break;
            case "decimal":
                displayMode = String.valueOf(i);
                break;
            case "hexadecimal":
                displayMode = i.toHexString(0);
                break;
        }
        return displayMode;
    }
}
