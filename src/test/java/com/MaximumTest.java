package com;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void maximumInteger() {
    int actualValue = FindMaximum.maximum(1,2,3);
        Assert.assertEquals(3,actualValue);
    }
    @Test
    public void maximumDouble() {
        float actualValue = FindMaximum.maximum(1.2f,2.2f,1.3f);
        Assert.assertEquals(2.2f,actualValue,0.0f);
    }
    @Test
    public void maximumString() {
        String  actualValue = FindMaximum.maximum("apple","peach","banana");
        Assert.assertEquals("peach", actualValue);
    }

}
