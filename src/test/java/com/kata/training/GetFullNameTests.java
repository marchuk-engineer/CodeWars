package com.kata.training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetFullNameTests {

    @Test
    public void test() {
        assertEquals("Clint Eastwood", new GetFullName("Clint", "Eastwood").getFullName());
    }

}