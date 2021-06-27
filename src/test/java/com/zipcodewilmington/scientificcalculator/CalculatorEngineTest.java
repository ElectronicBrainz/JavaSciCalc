package com.zipcodewilmington.scientificcalculator;

import com.sun.deploy.net.MessageHeader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorEngineTest {
    CalculatorEngine calcEngine = new CalculatorEngine();
    PersonalFunctionality persFunc = new PersonalFunctionality();
    Double firstValue = 10.0;
    Double secondValue = 5.0;
    Double expectedValue;
    Double actualValue;
    String songExpValue;
    String songActValue;

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

    @Test
    public void songTest() {
        songExpValue = "Making my way downtown\n" +
                "Walking fast, faces pass and I'm homebound\n" +
                "Staring blankly ahead\n" +
                "Just making my way\n" +
                "Making a way through the crowd\n" +
                "And I need you\n" +
                "And I miss you\n" +
                "And now I wonder\n" +
                "If I could fall into the sky\n" +
                "Do you think time would pass me by?\n" +
                "'Cause you know I'd walk a thousand miles\n" +
                "If I could just see you tonight\n" +
                "It's always times like these when I think of you\n" +
                "And wonder if you ever think of me\n" +
                "'Cause everything's so wrong, and I don't belong\n" +
                "Living in your precious memory\n" +
                "'Cause I need you\n" +
                "And I miss you\n" +
                "And now I wonder\n" +
                "If I could fall into the sky\n" +
                "Do you think time would pass me by?\n" +
                "Oh, 'cause you know I'd walk a thousand miles\n" +
                "If I could just see you tonight\n" +
                "And I, I don't wanna let you know\n" +
                "I, I drown in your memory\n" +
                "I, I don't wanna let this go\n" +
                "I, I don't\n" +
                "Making my way downtown\n" +
                "Walking fast, faces pass and I'm homebound\n" +
                "Staring blankly ahead, just making my way\n" +
                "Making a way through the crowd\n" +
                "And I still need you\n" +
                "And I still miss you\n" +
                "And now I wonder\n" +
                "If I could fall into the sky\n" +
                "Do you think time would pass us by?\n" +
                "'Cause you know I'd walk a thousand miles\n" +
                "If I could just see you, oh-oh\n" +
                "If I could fall into the sky\n" +
                "Do you think time would pass me by?\n" +
                "'Cause you know I'd walk a thousand miles\n" +
                "If I could just see you\n" +
                "If I could just hold you tonight";
        songActValue = persFunc.song();
        Assert.assertEquals(songExpValue, songActValue);

    }
}
