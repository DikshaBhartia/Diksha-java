package com.company;

import java.util.Scanner;

public class swapThreeNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int firstNumber= sc.nextInt();
        System.out.println("Enter Second Number: ");
        int secondNumber= sc.nextInt();
        System.out.println("Enter Third Number: ");
        int thirdNumber= sc.nextInt();
        //temp= Temporary variable
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = thirdNumber;
        thirdNumber = temp;
        System.out.println("Value of First Number is " + firstNumber
                + " and Value of Second Number is " + secondNumber + " and Value of Third Number is " + thirdNumber);

    }
}
