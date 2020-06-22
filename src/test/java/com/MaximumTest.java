package com;
import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void maximumInteger() {
        Assert.assertEquals(9, new FindMaximum(3,2,4,9).maximumValue());
    }
    @Test
    public void maximumDouble() {
        Assert.assertEquals(4.5f,(float) new FindMaximum(2.3f,1.2f,4.5f).maximumValue(),0.0f);
    }
    @Test
    public void maximumString() {
        Assert.assertEquals("peach", new FindMaximum("apple","peach").maximumValue());
    }
}
