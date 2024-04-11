package com.kata.training;

import java.util.Arrays;
import java.util.Comparator;

// https://www.codewars.com/kata/5a63948acadebff56f000018/train/java
public class ProductOfMaximumsOfArray {
    public static long maxProduct(int[] numbers, int sub_size) {
        return Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).mapToLong(Integer::longValue).limit(sub_size).reduce((x, y) -> x * y).orElse(1);
    }
}