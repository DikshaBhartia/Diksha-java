package com.company;

public class Pattern__Q2 {
    public static void main(String[] args) {
        //create pyramid using *
        int noOfRows = 5;
        for (int x=0; x<noOfRows; x++) {
            for (int y = noOfRows - x; y > 1; y--) {
                System.out.print(" ");
            }
            for (int y = 0; y <= x; y++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
