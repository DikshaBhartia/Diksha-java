package com.company;
import java.util.Scanner;

public class oddEvenSum {
    public static void main(String[] args) {
        int digit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers: ");
        int totalNumbers= sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        for (digit = 1; digit <= totalNumbers; digit++) {
            if (digit % 2 == 0)
                evenSum = evenSum + digit;
            else
                oddSum = oddSum + digit;
        }
            System.out.println("Sum of all odd numbers are: "+oddSum);
            System.out.println("Sum of all even numbers are: "+evenSum);

    }
}
