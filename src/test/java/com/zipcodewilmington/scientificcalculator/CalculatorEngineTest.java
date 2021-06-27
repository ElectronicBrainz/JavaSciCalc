package com.zipcodewilmington.scientificcalculator;

import com.sun.deploy.net.MessageHeader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorEngineTest {
    CalculatorEngine calcEngine = new CalculatorEngine();
    Double firstValue = 10.0;
    Double secondValue = 5.0;
    Double expectedValue;
    Double actualValue;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void additionTest() {
        //given
        expectedValue = 15.0;
        //when
        actualValue = calcEngine.addition(firstValue, secondValue);
        //then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void subtractionTest() {
        //given
        expectedValue = 5.0;
        //when
        actualValue = calcEngine.subtraction(firstValue, secondValue);
        //then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void multiplyTest() {
        //given
        expectedValue = 50.0;
        //when
        actualValue = calcEngine.multiply(firstValue, secondValue);
        //then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void divideTest() {
        //given
        expectedValue = 2.0;
        //when
        actualValue = calcEngine.divide(firstValue, secondValue);
        //then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void squareRootTest() {
        //given
        expectedValue = 3.1622776601683795;
        //when
        actualValue = calcEngine.squareRoot(firstValue);
        //then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void squareTest() {
        //given
        expectedValue = 100.0;
        //when
        actualValue = calcEngine.square(firstValue);
        //then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void exponentTest() {
        //given
        expectedValue = 100000.0;
        //when
        actualValue = calcEngine.exponent(firstValue, secondValue);
        //then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void inverseTest() {
        //given
        expectedValue = 0.1;
        //when
        actualValue = calcEngine.inverse(firstValue);
        //then
        Assert.assertEquals(expectedValue, actualValue);
    }
}
