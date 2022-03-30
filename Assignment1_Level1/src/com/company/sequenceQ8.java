package com.company;
import java.util.Scanner;

public class sequenceQ8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Print fibonnaci series till the term provided by user
        System.out.println("Enter the Nth term: ");
        int number= sc.nextInt();
        int firstNum=0;
        int secondNum=1;
        for(int i=1; i<=number;++i){
            int nextNum= firstNum+secondNum;
            firstNum=secondNum;
            secondNum=nextNum;
            System.out.print(firstNum+ " ");
        }

    }
}
