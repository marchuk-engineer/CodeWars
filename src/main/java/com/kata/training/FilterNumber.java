package com.kata.training;

import java.util.Objects;

public class FilterNumber {
    private FilterNumber() {
    }

    public static long filterString(final String value) {
        if (Objects.nonNull(value)) {
            return Long.parseLong(value.replaceAll("[^0-9]", ""));
        }
        throw new NullPointerException();
    }
}
