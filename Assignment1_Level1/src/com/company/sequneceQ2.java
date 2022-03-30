package com.company;
import java.util.Scanner;

public class sequneceQ2 {
    public static void main(String[] args) {
        System.out.println("Enter the Nth term: ");
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        for(int i=1; i<=number; i++ ){
            int result=(i*(-1));
            System.out.print(result + " ");
        }
    }
}
