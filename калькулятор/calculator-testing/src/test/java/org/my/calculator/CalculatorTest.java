package org.my.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator;
    @Test
    public void add ()
    {
        int a=1;
        int b=2;
        int res=calculator.add (a, b);
        Assert.assertTrue(res==3); /*if res!=3 throw new Error;*/
    }
    @Test
    public void substract () {
        int a=1;
        int b=2;
        int res=calculator.subtract (a, b);
        Assert.assertSame(res, 6);
    }
    @Test
    public void devide () {
        int a=10;
        int b=4;
        float res=calculator.devide (a, b);
        Assert.assertTrue(res== 2.5);}

}
