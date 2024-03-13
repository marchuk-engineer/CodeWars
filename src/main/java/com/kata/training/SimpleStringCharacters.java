package com.kata.training;

public class SimpleStringCharacters {
    //    In this Kata, you will be given a string and your task will be to return a list of ints detailing the count of uppercase letters, lowercase, numbers and special characters, as follows.
//
//    Solve("*'&ABCDabcde12345") = [4,5,5,3].
//            --the order is: uppercase letters, lowercase, numbers and special characters.
    public static int[] solve(String word) {
        int[] result = new int[4];
        int upperCase = 0, lowerCase = 0, numbers = 0, specialChar = 0;
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCase++;
            } else if (Character.isLowerCase(c)) {
                lowerCase++;
            } else if (Character.isDigit(c)) {
                numbers++;
            } else {
                specialChar++;
            }
        }
        result[0] = upperCase;
        result[1] = lowerCase;
        result[2] = numbers;
        result[3] = specialChar;

        return result;
    }
}