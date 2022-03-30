package com.company;
import java.util.Scanner;

public class sequenceQ6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Nth term: ");
        int number=sc.nextInt();
        for(int i=1; i<=number; i++){
            int value=3*((i- 1))^2 ;
            int value1=value+ (3 + ((-1)^i));
            int result= value1/2;
            System.out.print(result+ " ");
        }
    }
}
