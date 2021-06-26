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
    void displayMode() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        String result = scientificCalculator.DisplayMode("decimal",7);
        Assert.assertEquals("101",result);
    }

    @Test
    void switchUnitsMode() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        String result =scientificCalculator.switchUnitsMode("degrees",8);
        Assert.assertEquals("0.13962634015954636",result);
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
    void logarithmicFunctions() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
    //given
        String modeNaturalLog = "natural log";
        Integer inputForNaturalLog = 10;

    //when
        String resultForLogarithm = scientificCalculator.logarithmicFunctions(modeNaturalLog,inputForNaturalLog);
    //then
        Assert.assertEquals("2.302585092994046",resultForLogarithm);
    //given
        String modeInverselog = "inverse log";
        Integer inputForInverseLog = 10;
    //when
        String resultForLogarithm1 = scientificCalculator.logarithmicFunctions(modeInverselog,inputForInverseLog);
    //Then
        Assert.assertEquals("10000000000",resultForLogarithm1);
    }

    @Test
    void factorialFunction() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        Integer resultOfFactorial;
    //given
        Integer inputForPositiveValue = 4;
    //when
        resultOfFactorial = scientificCalculator.factorialFunction(inputForPositiveValue);
    //then
        Assert.assertEquals(Integer.valueOf(24),resultOfFactorial);
    //given
        Integer inputForNegativeValue = -1;
    //when
        resultOfFactorial = scientificCalculator.factorialFunction(inputForNegativeValue);
    //then
        Assert.assertEquals(Integer.valueOf(0),resultOfFactorial);
    //given
        Integer inputForZero = 0;
    //when
        resultOfFactorial = scientificCalculator.factorialFunction(inputForZero);
    //then
        Assert.assertEquals(Integer.valueOf(1),resultOfFactorial);
    }
}