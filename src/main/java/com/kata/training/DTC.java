package com.kata.training;

import java.text.DecimalFormat;

// https://www.codewars.com/kata/6397b0d461067e0030d1315e/train/java
public class DTC {
    public static double toIndustrial(String time) {
        String[] split = time.split(":");
        double hours = Double.valueOf(split[0]) * 60 / 60;
        double minutes = Double.valueOf(split[1]) / 60;
        return Double.parseDouble(new DecimalFormat("#.##").format(hours + minutes));
    }

    public static double toIndustrial(int time) {
        double result = (double) time / 60;
        return Double.parseDouble(new DecimalFormat("#.##").format(result));
    }

    public static String toNormal(double time) {
        int hours = (int) time;
        int minutes = (int) Math.round((time - hours) * 100 * 0.6);
        if (minutes == 60) {
            hours += 1;
            minutes = 0;
        }
        return String.format("%d:%02d", hours, minutes);
    }
}