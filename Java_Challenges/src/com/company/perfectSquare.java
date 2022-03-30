package com.company;
import java.util.Scanner;

public class perfectSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Number whose square has to be found
        System.out.println("Enter the number: ");
        int numSquare= sc.nextInt();
        if (isPerfectSquare(numSquare))
            System.out.print("PERFECT SQUARE");
        else
            System.out.print("Number is not a perfect square");
    }

    static boolean isPerfectSquare(int p){
        if (p >= 0) {
            int perfectSquare= (int)Math.sqrt(p);

            return ((perfectSquare * perfectSquare) == p);
        }
        return false;
    }

}
