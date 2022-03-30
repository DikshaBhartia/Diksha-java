package com.company;
import java.util.Scanner;

public class concatenateString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //enter string name to be concatenated
        System.out.println("Enter the first String: ");
        String str1=sc.next();
        System.out.println("Enter the second String: ");
        String str2=sc.next();
        String str3= str1.concat(str2);
        System.out.println("The concatenated string is " + str3);

    }
}
