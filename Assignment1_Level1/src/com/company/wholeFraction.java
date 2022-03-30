package com.company;
import java.util.Scanner;

public class wholeFraction {
    public static void main(String[] args) {
        //separate whole no. and fractional part from double
        System.out.println("Enter the Number: ");
        Scanner sc=new Scanner(System.in);
        double number=sc.nextDouble();
        String wholeNumber = String.valueOf(number);
        int fractionalPart = wholeNumber.indexOf(".");
        System.out.println(wholeNumber.substring(0, fractionalPart) + "  " + wholeNumber.substring(fractionalPart));
    }
}
