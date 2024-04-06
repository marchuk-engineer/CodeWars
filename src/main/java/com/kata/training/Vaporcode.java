package com.kata.training;

import java.util.StringJoiner;

//https://www.codewars.com/kata/5966eeb31b229e44eb00007a/train/java
public class Vaporcode {
    public static String vaporcode(String s) {
        var stringJoiner = new StringJoiner("  ");
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isSpaceChar(chars[i]))
                stringJoiner.add(Character.valueOf(chars[i]).toString().toUpperCase());
        }
        return stringJoiner.toString();
    }
}