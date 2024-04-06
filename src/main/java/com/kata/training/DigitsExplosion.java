package com.kata.training;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/585b1fafe08bae9988000314/train/java
public class DigitsExplosion {
    public static String explode(String digits) {
        return Arrays.stream(digits.split("")).map(e -> e.repeat(Integer.parseInt(e))).collect(Collectors.joining());
    }
}