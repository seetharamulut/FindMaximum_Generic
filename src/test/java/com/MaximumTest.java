package com;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void maximumInteger() {
        Integer[] integerArray = {3,6,9,3};
            Assert.assertEquals(9,new FindMaximum(integerArray).maximum());
    }
    @Test
    public void maximumDouble() {
       Float[] floatArray = {2.2f,1.3f,2.0f,4.5f};
        Assert.assertEquals(4.5f,(float) new FindMaximum(floatArray).maximum(),0.0f);
    }
    @Test
    public void maximumString() {
        String[] stringArray = {"apple","peach","banana","grape"};
        Assert.assertEquals("peach",new FindMaximum(stringArray).maximum());
    }

}
