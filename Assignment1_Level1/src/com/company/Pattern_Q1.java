package com.company;

public class Pattern_Q1 {
    public static void main(String[] args) {
        //create half pyramid using *
        int noOfRows = 5;
        for (int x = 1; x <= noOfRows; ++x) {
            for (int y = 1; y <= x; ++y) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

