package com.company;
import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        int number= sc.nextInt();
        //Reversing program
        String str = Integer.toString(number);
        String reverseNumber = new StringBuffer(str).reverse().toString();
        System.out.format("Result = %s ", reverseNumber);
    }
}

