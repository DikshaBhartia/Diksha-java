package com.company;
import java.util.Scanner;

public class onlyDigitString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //check whether input has only digits
        System.out.println("Input from user: ");
        String str= sc.nextLine();
        boolean result = str.matches("[0-9]+");
        System.out.println("String contains only digits : " + result);
    }
}



