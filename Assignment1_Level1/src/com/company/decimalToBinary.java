package com.company;
import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //enter decimal number to be converted into binary
        System.out.println("Enter the  decimal number: ");
        int decimalNumber= sc.nextInt();
        long binary = convertDecimalToBinary(decimalNumber);

        System.out.println("The decimal to binary conversion of " + decimalNumber + " is " + binary);
    }

    public static long convertDecimalToBinary(int num) {

        long binaryNumber = 0;
        int remainder, i = 1;

        while (num!=0) {
            remainder = num % 2;
            num /= 2;
            binaryNumber += remainder * i;
            i *= 10;
        }
        return binaryNumber;
    }
}
