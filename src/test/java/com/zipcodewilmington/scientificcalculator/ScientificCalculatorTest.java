package com.zipcodewilmington.scientificcalculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ScientificCalculatorTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }


    @Test
    public void displayModeForBinary() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        Integer input = 0;
        String result = "";
        //given
        input = 5;
        String modeForBinary = "binary";
        //when
        result = scientificCalculator.conversionFunction(modeForBinary, input);
        //then
        Assert.assertEquals("101", result);
    }
    @Test
    public void displayModeForDecimal() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        Integer input = 0;
        String result = "";
        //given
        input = 5;
        String modeForDecimal = "decimal";
        //when
        result = scientificCalculator.conversionFunction(modeForDecimal, input);
        //then
        Assert.assertEquals("5", result);
    }
    @Test
    public void displayModeForHexaDecimal() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        Integer input = 0;
        String result = "";
        //given
        input = 88;
        String modeForHexaDecimal = "hexadecimal";
        //when
        result = scientificCalculator.conversionFunction(modeForHexaDecimal, input);
        //then
        Assert.assertEquals("58", result);
    }
    @Test
    public void displayModeForOctal() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        Integer input = 0;
        String result = "";
    //given
        input = 88;
        String modeForOctal = "octal";
    //when
        result = scientificCalculator.conversionFunction(modeForOctal,input);
    //then
        Assert.assertEquals("130",result);
    }

    @Test
    public void switchUnitsMode() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        String result =scientificCalculator.switchTrigUnitsMode("degrees",8);
        Assert.assertEquals("458.3662361046586",result);
    }


    @Test
    public void trigonometricFunctionsForSineDegree() {
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
    public void trigonometricFunctionsForSineRadian() {
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
    public void trigonometricFunctionsForCosDegrees() {
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
    public void trigonometricFunctionsForCosRadians() {
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
    public void trigonometricFunctionsForTanRadians() {
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
    public void trigonometricFunctionsForTanDegrees() {
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
    public void trigonometricFunctionsForInverseTanDegrees() {
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
    public void trigonometricFunctionsForInverseTanRadians() {
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
    public void trigonometricFunctionsForInverseSineRadians() {
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
    public void trigonometricFunctionsForInverseSineDegrees() {
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
    public void trigonometricFunctionsForInverseCosDegrees() {
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
    public void trigonometricFunctionsForInverseCosRadians() {
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
    public void logarithmicFunctionsForNaturalLog() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
    //given
        String modeNaturalLog = "natural log";
        Integer inputForNaturalLog = 10;

    //when
        String resultForLogarithm = scientificCalculator.logarithmicFunctions(modeNaturalLog,inputForNaturalLog);
    //then
        Assert.assertEquals("2.302585093",resultForLogarithm);
    }

    @Test
    public void logarithmicFunctionsForInverseLog() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        //given
        String modeInverseLog = "inverse log";
        Integer inputForInverseLog = 10;
        //when
        String result = scientificCalculator.logarithmicFunctions(modeInverseLog,inputForInverseLog);
        //Then
        Assert.assertEquals("10000000000.000000000",result);
    }

    @Test
    public void logarithmicFunctionsForInverseNaturalLog() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        //given
        String modeInverseLog = "inverse natural log";
        Integer inputForInverseLog = 10;
        //when
        String result = scientificCalculator.logarithmicFunctions(modeInverseLog,inputForInverseLog);
        //Then
        Assert.assertEquals("22026.465794807",result);
    }

    @Test
    public void logarithmicFunctionsForLog() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        //given
        String modeInverseLog = "log";
        Integer input = 2;
        //when
        String result = scientificCalculator.logarithmicFunctions(modeInverseLog,input);
        //Then
        Assert.assertEquals("0.301029996",result);
    }

    @Test
    public void factorialFunctionForPositive() {
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
    public void factorialFunctionForNegative() {
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
    public void factorialFunctionForZero() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        Integer resultOfFactorial;
    //given
        Integer inputForZero = 0;
    //when
        resultOfFactorial = scientificCalculator.factorialFunction(inputForZero);
    //then
        Assert.assertEquals(Integer.valueOf(1),resultOfFactorial);
        }

    @Test
    public void customFeatureGetEulersValue() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        String result;
        //given
        Integer input = 2;
        //when
        result = String.valueOf(scientificCalculator.customFeatureGetEulersValue(input));
        //then
        Assert.assertEquals("7.38905609893065",result);
    }

    @Test
    public void customFeatureGetUlpValue() {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        String result;
        //given
        Integer input = 2;
        //when
        result = String.valueOf(scientificCalculator.customFeatureGetUlpValue(input));
        //then
        Assert.assertEquals("2.3841858E-7",result);
    }
}