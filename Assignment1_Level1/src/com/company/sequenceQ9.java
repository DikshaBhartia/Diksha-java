package com.company;
import java.util.Scanner;

public class sequenceQ9 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth term: ");
        int num = sc.nextInt();
        int oddIndex = 1;
        int evenIndex = 0;
       for (int i = 1; i <= num; i++) {

           // Find and print the ith term
           System.out.print(" "+((i % 2 == 0) ? (i - 1) : (i + 1)));



        }
    }
}
