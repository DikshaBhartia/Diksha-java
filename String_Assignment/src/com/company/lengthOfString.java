package com.company;
import java.util.Scanner;

public class lengthOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();
        int length = str.length();
        System.out.println("The length of String \""+str+"\" is: " +length);
    }
}


