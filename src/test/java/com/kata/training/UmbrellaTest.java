package com.kata.training;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UmbrellaTest {
    @Test
    @DisplayName("Fixed Tests")
    void testUmbrellas() {
        assertEquals(0, Umbrella.minUmbrellas(Umbrella.Weather.CLOUDY), "wrong answer for no rain");
        assertEquals(1,
                Umbrella.minUmbrellas(Umbrella.Weather.RAINY, Umbrella.Weather.RAINY, Umbrella.Weather.RAINY, Umbrella.Weather.RAINY),
                "wrong answer for always rainy."
        );
        assertEquals(2,
                Umbrella.minUmbrellas(Umbrella.Weather.OVERCAST, Umbrella.Weather.RAINY, Umbrella.Weather.CLEAR, Umbrella.Weather.THUNDERSTORMS),
                "wrong answer for 2 dry mornings and 2 rainy afternoons."
        );
    }
}