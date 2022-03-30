package com.company;
import java.util.Scanner;

public class sequenceQ1 {
    public static void main(String[] args) {
        System.out.println("Enter the Nth Term: ");
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        for(int i =2; i<=2*number; i+=2){
            int result=(i*i);
            System.out.print(result + " ");
        }

    }
}
