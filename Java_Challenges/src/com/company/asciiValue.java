package com.company;
import java.util.Scanner;

public class asciiValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Character whose ASCII value has to be found
        System.out.println("Enter the Character: ");
        char asciiChar=sc.next().charAt(0);
        int asciiVal=asciiChar;
        System.out.println("ASCII value of " + asciiChar + " is " + asciiVal);


    }
}
