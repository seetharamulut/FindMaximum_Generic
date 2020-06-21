package com;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void maximumInteger_atPositionOne_shouldBeTrue() {
    int actualValue = FindMaximum.integerMaximum(3,2,1);
        Assert.assertEquals(3,actualValue);
    }
    @Test
    public void maximumInteger_atPositionTwo_shouldBeTrue() {
        int actualValue = FindMaximum.integerMaximum(2,3,1);
        Assert.assertEquals(3,actualValue);
    }
    @Test
    public void maximumInteger_atPositionThree_shouldBeTrue() {
        int actualValue = FindMaximum.integerMaximum(1,2,3);
        Assert.assertEquals(3,actualValue);
    }
    @Test
    public void maximumFloat_atPositionOne_shouldBeTrue() {
        float actualValue = FindMaximum.floatMaximum(3.3f,3.2f, 3.1f);
        Assert.assertEquals(3.3f,actualValue,0.0f);
    }
    @Test
    public void maximumFloat_atPositionTwo_shouldBeTrue() {
        float actualValue = FindMaximum.floatMaximum(2.3f,3.2f, 1.1f);
        Assert.assertEquals(3.2f,actualValue,0.0f);
    }
    @Test
    public void maximumFloat_atPositionThree_shouldBeTrue() {
        float actualValue = FindMaximum.floatMaximum(1.3f,2.2f, 3.1f);
        Assert.assertEquals(3.1f,actualValue,0.0f);
    }
}
