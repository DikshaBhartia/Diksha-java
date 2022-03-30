package com.company;
import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //enter the year to check whether it's leap year or not
        System.out.println("Enter the Year: ");
        int isLeapYear = sc.nextInt();
        if ((isLeapYear % 400 == 0)
                || ((isLeapYear % 4 == 0) && (isLeapYear % 100 != 0))) {
            System.out.println(isLeapYear + "is LEAP YEAR");
        } else {
            System.out.println(isLeapYear + " is Not a Leap Year");

        }
    }
}
