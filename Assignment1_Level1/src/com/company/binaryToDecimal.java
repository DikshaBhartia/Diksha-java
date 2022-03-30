package com.company;
import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Enter the binary number to be converted to decimal
        System.out.println("Enter the Binary Number: ");
        int binaryNum= sc.nextInt();
        //method call by passing binary number
        int decimal = convertBinaryToDecimal(binaryNum);
        System.out.println("Binary to decimal conversion of " + binaryNum + " is "+ decimal);
    }

    public static int convertBinaryToDecimal(long num) {
        int decimalNumber = 0, i = 0;
        long remainder;

        while (num != 0) {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        return decimalNumber;
    }
}

