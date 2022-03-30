package com.company;
import java.util.Scanner;

public class exponent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base digit: ");
        int baseNum = sc.nextInt();
        System.out.println("Enter the exponent: ");
        int expNum = sc.nextInt();
        long result = 1;
        while (expNum!=0) {
            result = result * baseNum;
            --expNum;
        }
        System.out.print("The result of exponent is: " + result);
    }
}