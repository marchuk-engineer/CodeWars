package com.kata.training;

public class GCD {
    public static int compute(int x, int y) {
        int i = Math.min(x, y);
        while (i > 1) {
            if (x % i == 0 && y % i == 0) {
                return i;
            }
            i--;
        }
        return 1;
    }
}