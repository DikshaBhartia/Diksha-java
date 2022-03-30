package com.company;
import java.util.Scanner;

public class compareStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First String: ");
        String str1=sc.nextLine();
        System.out.println("Enter the Second String: ");
        String str2=sc.nextLine();
        //returns 0 if strings are equal; -1 and so on if (string1<string2); returns 1,.. if(str1>str2)
        System.out.println(str1.compareTo(str2));

    }
}
