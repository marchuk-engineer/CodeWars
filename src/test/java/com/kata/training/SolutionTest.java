package com.kata.training;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals("", AlternateCase.alternateCase(""));
        assertEquals("ABC", AlternateCase.alternateCase("abc"));
        assertEquals("abc", AlternateCase.alternateCase("ABC"));
        assertEquals("hELLO wORLD!", AlternateCase.alternateCase("Hello World!"));
    }
}