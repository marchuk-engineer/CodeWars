package com.kata.training;

// https://www.codewars.com/kata/580dda86c40fa6c45f00028a/train/java
public class FindOddCubes {

    public static int cubeOdd(int arr[]) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) result += Math.pow(arr[i], 3);
        }
        return result;
    }
}