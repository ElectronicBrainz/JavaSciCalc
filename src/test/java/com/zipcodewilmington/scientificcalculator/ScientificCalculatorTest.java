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
    void trigonometricFunctionsForSineDegree() {
        //given
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        String mode = "sine";
        Integer input = 8;
        String inputMode = "degrees";
        //when
        String result = scientificCalculator.trigonometricFunctions(mode,input,inputMode);
        //then
        Assert.assertEquals("0.13917310096006544",result);
    }

    @Test
    void trigonometricFunctionsForSineRadian() {
        //given
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        String mode = "sine";
        Integer input = 8;
        String inputMode = "radians";
        //when
        String result = scientificCalculator.trigonometricFunctions(mode,input,inputMode);
        //then
        Assert.assertEquals("0.9893582466233818",result);
    }

    @Test
    void trigonometricFunctionsForCosDegrees() {
        //given
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        String mode = "cosine";
        Integer input = 8;
        String inputMode = "degrees";
        //when
        String result = scientificCalculator.trigonometricFunctions(mode,input,inputMode);
        //then
        Assert.assertEquals("0.9902680687415704",result);
    }
    @Test
    void trigonometricFunctionsForCosRadians() {
        //given
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        String mode = "cosine";
        Integer input = 8;
        String inputMode = "radians";
        //when
        String result = scientificCalculator.trigonometricFunctions(mode,input,inputMode);
        //then
        Assert.assertEquals("-0.14550003380861354",result);
    }
    @Test
    void trigonometricFunctionsForTanRadians() {
        //given
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        String mode = "tangent";
        Integer input = 8;
        String inputMode = "radians";
        //when
        String result = scientificCalculator.trigonometricFunctions(mode,input,inputMode);
        //then
        Assert.assertEquals("-6.799711455220379",result);
    }
    @Test
    void trigonometricFunctionsForTanDegrees() {
        //given
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        String mode = "tangent";
        Integer input = 8;
        String inputMode = "degrees";
        //when
        String result = scientificCalculator.trigonometricFunctions(mode,input,inputMode);
        //then
        Assert.assertEquals("0.14054083470239145",result);
    }
    @Test
    void trigonometricFunctionsForInverseTanDegrees() {
        //given
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        String mode = "inversetan";
        Integer input = 8;
        String inputMode = "degrees";
        //when
        String result = scientificCalculator.trigonometricFunctions(mode,input,inputMode);
        //then
        Assert.assertEquals("82.87498365109819",result);
    }
    @Test
    void trigonometricFunctionsForInverseTanRadians() {
        //given
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        String mode = "inversetan";
        Integer input = 8;
        String inputMode = "radians";
        //when
        String result = scientificCalculator.trigonometricFunctions(mode,input,inputMode);
        //then
        Assert.assertEquals("1.446441332248135",result);
    }
    @Test
    void trigonometricFunctionsForInverseSineRadians() {
        //given
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        String mode = "inversesine";
        Integer input = 1;
        String inputMode = "radians";
        //when
        String result = scientificCalculator.trigonometricFunctions(mode,input,inputMode);
        //then
        Assert.assertEquals("1.5707963267948966",result);
    }
    @Test
    void trigonometricFunctionsForInverseSineDegrees() {
        //given
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        String mode = "inversesine";
        Integer input = 1;
        String inputMode = "degrees";
        //when
        String result = scientificCalculator.trigonometricFunctions(mode,input,inputMode);
        //then
        Assert.assertEquals("90.0",result);
    }
    @Test
    void trigonometricFunctionsForInverseCosDegrees() {
        //given
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        String mode = "inversecosine";
        Integer input = 1;
        String inputMode = "degrees";
        //when
        String result = scientificCalculator.trigonometricFunctions(mode,input,inputMode);
        //then
        Assert.assertEquals("0.0",result);
    }
    @Test
    void trigonometricFunctionsForInverseCosRadians() {
        //given
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        String mode = "inversecosine";
        Integer input = 1;
        String inputMode = "radians";
        //when
        String result = scientificCalculator.trigonometricFunctions(mode,input,inputMode);
        //then
        Assert.assertEquals("0.0",result);
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
        Integer inputForInverseLog = 1;
        //when
        String result = scientificCalculator.logarithmicFunctions(modeInverseLog,inputForInverseLog);
        //Then
        Assert.assertEquals(10.0,Double.valueOf(result),Double.valueOf(result));
    }

    @Test
    void logarithmicFunctionsForInverseNaturalLog() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        //given
        String modeInverseLog = "inverse natural log";
        Integer inputForInverseLog = 10;
        //when
        String result = scientificCalculator.logarithmicFunctions(modeInverseLog,inputForInverseLog);
        //Then
        Assert.assertEquals("22026.465794806718",result);
    }

    @Test
    void logarithmicFunctionsForLog() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        //given
        String modeInverseLog = "log";
        Integer input = 2;
        //when
        String result = scientificCalculator.logarithmicFunctions(modeInverseLog,input);
        //Then
        Assert.assertEquals("0.3010299956639812",result);
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