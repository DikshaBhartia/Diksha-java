package com.company;
import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        //taking input from user
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2= sc.nextInt();
        System.out.println("Enter the Third Number: ");
        int num3= sc.nextInt();
        //largest number
        if( num1 >= num2 && num1 >= num3)
            System.out.println(num1+" is the largest Number");
        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2+" is the largest Number");
        else
            System.out.println(num3+" is the largest Number");
        //second largest number
        if (num1 > num2 && num1 < num3 || num1 > num3 && num1 < num2)
            System.out.println(num1+" is the second largest Number");
        else if (num2 > num1 && num2 < num3 || num2 > num3 && num2 < num1)
            System.out.println(num2+" is the second largest Number");
        else
            System.out.println(num3+" is the third largest Number");
    }
}
