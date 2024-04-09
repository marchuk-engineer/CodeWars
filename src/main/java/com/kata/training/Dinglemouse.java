package com.kata.training;

public class Dinglemouse {

    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
//        Cat Years
//        15 cat years for first year
//        +9 cat years for second year
//        +4 cat years for each year after that
//        Dog Years
//        15 dog years for first year
//        +9 dog years for second year
//        +5 dog years for each year after that
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