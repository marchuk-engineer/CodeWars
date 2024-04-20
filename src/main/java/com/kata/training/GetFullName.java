package com.kata.training;

import java.util.Objects;

// https://www.codewars.com/kata/597c684822bc9388f600010f/train/java
public class GetFullName {
    private String firstName;
    private String lastName;

    public GetFullName(String firstName, String lastName) {
        if (Objects.nonNull(firstName) && Objects.nonNull(lastName)) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        StringBuilder fullName = new StringBuilder();
        if (!firstName.isEmpty())
            fullName.append(firstName);
        if (!fullName.isEmpty() && !lastName.isEmpty())
            fullName.append(" ");
        if (!lastName.isEmpty())
            fullName.append(lastName);

        return fullName.toString();
    }
}
