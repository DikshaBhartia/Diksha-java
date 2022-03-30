package com.company;
import java.util.Scanner;

public class uglyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input number to find whether it's ugly number(prime factors:2,3,5) or not
        System.out.println("Enter an Integer Number: ");
        int integerNum = sc.nextInt();
        if (integerNum <= 0) {
            System.out.print("Incorrect Input Integer");
        }

        int x = 0;
        while (integerNum != 1) {

            if (integerNum % 5 == 0) {
                integerNum /= 5;
            } else if (integerNum % 3 == 0) {
                integerNum /= 3;
            } else if (integerNum % 2 == 0) {
                integerNum /= 2;
            } else {
                System.out.print("Input is not an ugly number.");
                x = 1;
                break;
            }
        }
        if (x == 0)
            System.out.print("Input is an ugly number.");
    }
}

