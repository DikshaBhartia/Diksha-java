package com.company;
import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //enter the starting and end number to be checked whether prime or not
        System.out.println("Enter the starting number: ");
        int firstNum= sc.nextInt();
        System.out.println("Enter the end number: ");
        int endNum=sc.nextInt();
        while (firstNum < endNum ) {
            boolean flag = false;

            for (int i = 2; i <= firstNum / 2; ++i) {
                if (firstNum % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && firstNum != 0 && firstNum != 1)
                System.out.println("The prime number between the given range are: " + firstNum);

            ++firstNum;
        }
    }
}
