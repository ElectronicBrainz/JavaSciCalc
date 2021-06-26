package com.zipcodewilmington.scientificcalculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScientificCalculatorTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void switchDisplayMode() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        String result = scientificCalculator.switchDisplayMode("binary");
        Assert.assertEquals("binary",result);
    }

    @org.junit.jupiter.api.Test
    void displayModeForBinary() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        Integer input = 0;
        String result = "";
        //given
        input = 5;
        String modeForBinary = "binary";
        //when
        result = scientificCalculator.DisplayMode(modeForBinary, input);
        //then
        Assert.assertEquals("101", result);
    }
    @org.junit.jupiter.api.Test
    void displayModeForDecimal() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        Integer input = 0;
        String result = "";
        //given
        input = 5;
        String modeForDecimal = "decimal";
        //when
        result = scientificCalculator.DisplayMode(modeForDecimal, input);
        //then
        Assert.assertEquals("5", result);
    }
    @org.junit.jupiter.api.Test
    void displayModeForHexaDecimal() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        Integer input = 0;
        String result = "";
        //given
        input = 88;
        String modeForHexaDecimal = "hexadecimal";
        //when
        result = scientificCalculator.DisplayMode(modeForHexaDecimal, input);
        //then
        Assert.assertEquals("58", result);
    }
    @org.junit.jupiter.api.Test
    void displayModeForOctal() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        Integer input = 0;
        String result = "";
    //given
        input = 88;
        String modeForOctal = "octal";
    //when
        result = scientificCalculator.DisplayMode(modeForOctal,input);
    //then
        Assert.assertEquals("130",result);
    }

    @Test
    void switchUnitsMode() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        String result =scientificCalculator.switchUnitsMode("degrees",8);
        Assert.assertEquals("458.3662361046586",result);
    }

    @Test
    void testSwitchUnitsMode() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        String result =scientificCalculator.switchUnitsMode("degrees");
        Assert.assertEquals("degrees",result);

    }

    @Test
    void trigonometricFunctions() {
        //given
        ScientificCalculator scientificCalculator = new ScientificCalculator();
//        //when
//        String resultForRadians = scientificCalculator.trigonometricFunctions("sine",10,"radians");
//        //then
//        Assert.assertEquals("-0.5440211108893698",resultForRadians);
        //when
        String resultForDegrees = scientificCalculator.trigonometricFunctions("sine",10,"degrees");
        //then
        Assert.assertEquals("-0.5440211108893698",resultForDegrees);
    }

    @Test
    void logarithmicFunctionsForNaturalLog() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
    //given
        String modeNaturalLog = "natural log";
        Integer inputForNaturalLog = 10;

    //when
        String resultForLogarithm = scientificCalculator.logarithmicFunctions(modeNaturalLog,inputForNaturalLog);
    //then
        Assert.assertEquals("2.302585092994046",resultForLogarithm);
    }

    @Test
    void logarithmicFunctionsForInverseLog() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        //given
        String modeInverseLog = "inverse log";
        Integer inputForInverseLog = 10;
        //when
        String resultForLogarithm1 = scientificCalculator.logarithmicFunctions(modeInverseLog,inputForInverseLog);
        //Then
        Assert.assertEquals("10000000000",resultForLogarithm1);
    }

    @Test
    void factorialFunctionForPositive() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        Integer resultOfFactorial;
        //given
        Integer inputForPositiveValue = 4;
        //when
        resultOfFactorial = scientificCalculator.factorialFunction(inputForPositiveValue);
        //then
        Assert.assertEquals(Integer.valueOf(24), resultOfFactorial);
    }
    @Test
    void factorialFunctionForNegative() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        Integer resultOfFactorial;
        //given
        Integer inputForNegativeValue = -1;
        //when
        resultOfFactorial = scientificCalculator.factorialFunction(inputForNegativeValue);
        //then
        Assert.assertEquals(Integer.valueOf(0), resultOfFactorial);
    }
    @Test
    void factorialFunctionForZero() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        Integer resultOfFactorial;
    //given
        Integer inputForZero = 0;
    //when
        resultOfFactorial = scientificCalculator.factorialFunction(inputForZero);
    //then
        Assert.assertEquals(Integer.valueOf(1),resultOfFactorial);
        }
    }
}