package com;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void maximumInteger() {
            Assert.assertEquals(3,new FindMaximum(1,2,3).maximum());
    }
    @Test
    public void maximumDouble() {
        float actualValue = (float) new FindMaximum(1.2f,3.2f,4.5f).maximum();
        Assert.assertEquals(4.5f,actualValue,0.0f);
    }
    @Test
    public void maximumString() {
        Assert.assertEquals("peach",new FindMaximum("apple","peach","banana").maximum());
    }

}
