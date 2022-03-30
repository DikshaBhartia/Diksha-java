package com.company;
import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        //program to calculate simple interest
        //where P is Principal Amount, R is Rate Per Annum & T is Time in years
        float P, R, T, simpleInterest;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Principal Amount : ");
        P = scan.nextFloat();
        System.out.print("Enter the Rate of interest(in %) : ");
        R = scan.nextFloat();
        System.out.print("Enter the Time period(in years) : ");
        T = scan.nextFloat();
        scan.close();
        simpleInterest = (P * R * T) / 100;
        System.out.print("Simple Interest is: " +simpleInterest);

    }
}
