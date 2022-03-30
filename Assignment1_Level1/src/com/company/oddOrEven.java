package com.company;
import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        //Check whether given number is odd or even
        System.out.println("Enter Any Number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("The Number is Even");
        } else {
            System.out.println("The Number is Odd");
        }
    }
}

