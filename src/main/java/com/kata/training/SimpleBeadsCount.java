package com.kata.training;

//Two red beads are placed between every two blue beads. There are N blue beads. After looking at the arrangement below work out the number of red beads.
//
//@ @@ @ @@ @ @@ @ @@ @ @@ @
//
//        Implement count_red_beads(n) (in PHP count_red_beads($n); in Java, Javascript, TypeScript, C, C++ countRedBeads(n)) so that it returns the number of red beads.
//If there are less than 2 blue beads return 0.

public class SimpleBeadsCount {

    public static int countRedBeads(final int nBlue) {
        if (nBlue < 2) return 0;
        int result = -2;
        for (int i = 0; i < nBlue; i++) {
            result += 2;
        }
        return result;
    }

}
