package com.kata.training;

// https://www.codewars.com/kata/5a6d3bd238f80014a2000187/train/java
public class Dinglemouse {

    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
        int[] years = new int[2];
        years[0] = catYears < 15 ? 0 :
                catYears < 24 ? 1 :
                        catYears < 28 ? 2 :
                                (catYears - 24) / 4 + 2;
        years[1] = dogYears < 15 ? 0 :
                dogYears < 24 ? 1 :
                        dogYears < 29 ? 2 :
                                (dogYears - 24) / 5 + 2;
        return years;
    }

}