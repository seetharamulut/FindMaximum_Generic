package com;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void maximumInteger() {
        Integer[] integerArray = {3,6,9,3};
        FindMaximum findMaximum = new FindMaximum(integerArray);
            Assert.assertEquals(9,(int)findMaximum.maximum());
        findMaximum.printMax();
    }
    @Test
    public void maximumDouble() {
       Float[] floatArray = {2.2f,1.3f,2.0f,4.5f};
       FindMaximum findMaximum = new FindMaximum(floatArray);
        Assert.assertEquals(4.5f,(float) findMaximum.maximum(),0.0f);
        findMaximum.printMax();
    }
    @Test
    public void maximumString() {
        String[] stringArray = {"apple","peach","banana","grape"};
        FindMaximum findMaximum = new FindMaximum(stringArray);
        Assert.assertEquals("peach",(String)findMaximum.maximum());
        findMaximum.printMax();
    }
}
