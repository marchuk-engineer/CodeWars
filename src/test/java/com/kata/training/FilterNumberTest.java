package com.kata.training;

import org.junit.Assert;
import org.junit.Test;


public class FilterNumberTest {

    @Test
    public void filterString_null_throwNullPointer() {
        Assert.assertThrows(NullPointerException.class, () -> FilterNumber.filterString(null));
    }

    @Test
    public void filterString_123() {
        long result = FilterNumber.filterString("kata123");
        Assert.assertEquals(123L, result);
    }

    @Test
    public void filterString_06() {
        long result = FilterNumber.filterString("tes0i6g");
        Assert.assertEquals(06, result);
    }

}