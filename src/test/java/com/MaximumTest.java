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
}
