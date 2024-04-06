package com.kata.training;

// https://www.codewars.com/kata/580755730b5a77650500010c/train/java
public class OddEvenSort {
    public static String sortMyString(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sbEven = new StringBuilder();
        StringBuilder sbOdd = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) sbEven.append(chars[i]);
            else sbOdd.append(chars[i]);
        }
        return sbEven.toString() + " " + sbOdd.toString();
    }
}