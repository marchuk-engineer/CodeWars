package com.kata.training;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@DisplayName("Sample Tests")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SolutionTest {
    @Test
    @Order(1)
    @DisplayName("First sample test")
    void sampleTestOne() {
        assertEquals(6, DebugSumOfDigitsOfNumber.sumOfDigits(123), "For input: " + 123);
    }
    @Test
    @Order(2)
    @DisplayName("Second sample test")
    void sampleTestTwo() {
        assertEquals(1, DebugSumOfDigitsOfNumber.sumOfDigits(1), "For input: " + 1);
    }
    @Test
    @Order(3)
    @DisplayName("Third sample test")
    void sampleTestThree() {
        assertEquals(1, DebugSumOfDigitsOfNumber.sumOfDigits(100), "For input: " + 100);
    }
    @Test
    @Order(4)
    @DisplayName("Fourth sample test")
    void sampleTestFour() {
        assertEquals(12, DebugSumOfDigitsOfNumber.sumOfDigits(291), "For input: " + 291);
    }
    @Test
    @Order(5)
    @DisplayName("Fifth sample test")
    void sampleTestFive() {
        assertEquals(36, DebugSumOfDigitsOfNumber.sumOfDigits(9999), "For input: " + 9999);
    }
}
