package com.company;
import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String name: ");
        String word= sc.next();
        StringBuilder reverseString = new StringBuilder(word);
        reverseString.reverse();
        String result = reverseString.toString();
        System.out.println("Reversed string is : "+result);
    }
}
