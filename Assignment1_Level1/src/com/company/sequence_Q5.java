package com.company;
import  java.util.Scanner;

public class sequence_Q5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Nth term: ");
        int number=sc.nextInt();
        for(int iterator=0; iterator<=number; iterator++){
            int result=iterator*iterator;
            System.out.print(result + " ");
        }


    }
}
