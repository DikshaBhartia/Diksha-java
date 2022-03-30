package com.company;
import java.util.Scanner;

public class sequenceQ3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Nth Term: ");
        int number= sc.nextInt();
        for(int i=1; i<number; i++){
            int d=1;
            for(int j=1; j<=i; j++){
                d=d*i;
            }
            System.out.print(d +" ");
        }
    }
}
