package com.company;
import java.util.Scanner;

public class sequenceQ7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Nth Term: ");
        int number= sc.nextInt();
        int pr = 1;
        for(int i = 1; i<=number; i++){
            if(i%2==0)
            {
                System.out.print(-1*pr+" ");
            }
            else
            {
                System.out.print(pr+" ");
            }
            pr= (int)(pr+Math.pow(i,2));

        }
    }
}
