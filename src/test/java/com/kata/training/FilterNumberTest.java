package com.kata.training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FilterNumberTest {

    @Test
    public void filterString_null_throwNullPointer() {
        Assertions.assertThrows(NullPointerException.class, () -> FilterNumber.filterString(null));
    }

    @Test
    public void filterString_123() {
        long result = FilterNumber.filterString("kata123");
        Assertions.assertEquals(123L, result);
    }

    @Test
    public void filterString_06() {
        long result = FilterNumber.filterString("tes0i6g");
        Assertions.assertEquals(06, result);
    }

}