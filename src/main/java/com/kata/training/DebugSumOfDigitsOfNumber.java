package com.kata.training;

// https://www.codewars.com/kata/563d59dd8e47a5ed220000ba/train/java
public class DebugSumOfDigitsOfNumber {
    public static int sumOfDigits(int n) {
        int sum = 0;
        String[] digits = String.valueOf(n).split("");
        for (String digit : digits) {
            sum += Integer.parseInt(digit);
        }
        return sum;
    }
}