package com.kata.training;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// https://www.codewars.com/kata/553e8b195b853c6db4000048/train/java
public class AllUnique {
    public static boolean hasUniqueChars(String str) {
        var set = new HashSet<>();
        List<String> list = Stream.of(str.split("")).collect(Collectors.toList());
        for (String el : list) {
            boolean result = set.add(el);
            if (!result) return false;
        }
        return true;
    }
}