package com.kata.training;

import java.util.List;

import static com.kata.training.Umbrella.Weather.RAINY;
import static com.kata.training.Umbrella.Weather.THUNDERSTORMS;

// https://www.codewars.com/kata/58298e19c983caf4ba000c8d/train/java
public class Umbrella {
    public static int minUmbrellas(Weather... forecast) {
        int umbrellasAtHome = 0, umbrellasAtWork = 0, totalUmbrellas = 0;

        for (int i = 0; i < forecast.length; i++) {
            if (i % 2 == 0) {
                if (isRaining(forecast[i])) {
                    if (umbrellasAtHome > 0) {
                        umbrellasAtHome--;
                        umbrellasAtWork++;
                    } else {
                        totalUmbrellas++;
                        umbrellasAtWork++;
                    }
                }
            } else {
                if (isRaining(forecast[i])) {
                    if (umbrellasAtWork > 0) {
                        umbrellasAtWork--;
                        umbrellasAtHome++;
                    } else {
                        totalUmbrellas++;
                        umbrellasAtHome++;
                    }
                }
            }
        }

        return totalUmbrellas;
    }

    private static boolean isRaining(Weather weather) {
        return List.of(RAINY, THUNDERSTORMS).contains(weather);
    }

    public enum Weather {
        CLEAR, SUNNY, CLOUDY, RAINY, OVERCAST, WINDY, THUNDERSTORMS;
    }

}
