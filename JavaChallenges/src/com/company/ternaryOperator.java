package com.company;
import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Take 3 number as input from user to find highest among them
        System.out.println("Enter the First Number: ");
        int value1= sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int value2= sc.nextInt();
        System.out.println("Enter the Third Number: ");
        int value3= sc.nextInt();

        int ternaryOp = value1>value2 ? value1:value2;
        int largestNum = value3>ternaryOp ? value3:ternaryOp;
        System.out.println("Largest Number using ternary operator is: "+ largestNum);

    }
}
