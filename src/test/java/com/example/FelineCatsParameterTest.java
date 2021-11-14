package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineCatsParameterTest {

    private final int expected;

    public FelineCatsParameterTest(int expected) {
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getDataForKittens() {
        return new Object[][]{
                {2},
                {3},
                {5},
        };
    }

    @Test
    public void testKittensArgumentTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(expected);
        Assert.assertEquals(expected, actual);
    }
}