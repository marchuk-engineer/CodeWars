package com.kata.training;

//  https://www.codewars.com/kata/590e03aef55cab099a0002e8/train/java
public class Incrementer {

    public static int[] incrementer(int[] numbers) {
        if (numbers.length == 0) return new int[0];
        for (int i = numbers.length - 1; i >= 0; i--) {
            int number = numbers[i] + i + 1;
            if (String.valueOf(number).length() > 1) {
                number = number % 10;
                numbers[i] = number;
            } else numbers[i] = number;
        }
        return numbers;
    }

}