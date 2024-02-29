package com.kata.training;

import org.junit.Assert;
import org.junit.Test;


public class KataTest {

    @Test
    public void filterString_null_throwNullPointer() {
        Assert.assertThrows(NullPointerException.class, () -> Kata.filterString(null));
    }

    @Test
    public void filterString_123() {
        long result = Kata.filterString("kata123");
        Assert.assertEquals(123L, result);
    }

    @Test
    public void filterString_06() {
        long result = Kata.filterString("tes0i6g");
        Assert.assertEquals(06, result);
    }

    @Test
    public void filterString_NoNumbersPresent_0() {
        long result = Kata.filterString("tes0i6g");
        Assert.assertEquals(06, result);
    }

}