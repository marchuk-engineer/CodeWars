package com.kata.training;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class IncrementerTests {

    @ParameterizedTest(name = "numbers: {0} expected: {1}")
    @MethodSource
    @DisplayName("Basic Tests")
    void basicTests(int[] numbers, int[] expected) {
        assertArrayEquals(expected, Incrementer.incrementer(numbers));
    }

    static Stream<Arguments> basicTests() {
        return Stream.of(
                arguments(new int[0], new int[0]),
                arguments(new int[]{1, 2, 3}, new int[]{2, 4, 6}),
                arguments(new int[]{4, 6, 7, 1, 3}, new int[]{5, 8, 0, 5, 8}),
                arguments(new int[]{3, 6, 9, 8, 9}, new int[]{4, 8, 2, 2, 4}),
                arguments(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 8}, new int[]{2, 4, 6, 8, 0, 2, 4, 6, 8, 9, 0, 1, 2, 2})
        );
    }

}
