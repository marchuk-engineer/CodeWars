package com.kata.training;

import java.util.stream.Collectors;
import java.util.stream.Stream;

class AlternateCase {
    //    Write function alternateCase which switch every letter in string from upper to lower and from lower to upper. E.g: Hello World -> hELLO wORLD
    static String alternateCase(final String string) {
        if (string.isEmpty()) return string;
        Stream<String> split = Stream.of(string.split(""));
        return split
                .map(ch -> Character.isUpperCase(ch.charAt(0)) ? ch.toLowerCase() : ch.toUpperCase()).collect(Collectors.joining());
    }
}