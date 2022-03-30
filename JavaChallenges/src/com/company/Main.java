package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Statement: ");
        String str=sc.next();
        String upperCaseStr = str.toUpperCase();
        System.out.println("String changed to upper case: " + upperCaseStr);

    }
}
