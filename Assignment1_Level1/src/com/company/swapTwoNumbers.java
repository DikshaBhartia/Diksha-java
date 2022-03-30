package com.company;
import java.util.Scanner;

public class swapTwoNumbers {
    public static void main(String[] args) {
        //Swap Two numbers
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int firstNumber= sc.nextInt();
        System.out.println("Enter Second Number: ");
        int secondNumber= sc.nextInt();
        //temp= Temporary variable
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;
        System.out.println("Value of First Number is " + firstNumber
                + " and Value of Second Number is " + secondNumber);

    }
}
