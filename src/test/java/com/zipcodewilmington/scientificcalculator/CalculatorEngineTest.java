package com.zipcodewilmington.scientificcalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorEngineTest {

    @Before
    public void setUp() throws Exception {
        CalculatorEngine calcEngine = new CalculatorEngine();
    }

    @Test
    public void addition() {
        //given
        Double expected = 10.0;
        Double actual = 5.0;
        //when

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void subtraction() {

    }

    @Test
    public void multiply() {

    }

    @Test
    public void divide() {

    }
}