package com.company;
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Enter the number to be checked for Armstrong Number or not
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int dummyNum;
        dummyNum=num;
        int value=0;
        int finalValue=0;
        while (dummyNum != 0){
            value = dummyNum % 10;
            finalValue += Math.pow(value, 3);
            dummyNum /= 10;
        }
            if (finalValue == num)
                System.out.println(num + " is an Armstrong number.");
            else
                System.out.println(num + " is not an Armstrong number.");

    }
}
