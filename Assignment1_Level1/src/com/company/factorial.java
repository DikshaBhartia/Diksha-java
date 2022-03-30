package com.company;
import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //finding factorial of a given number
        System.out.println("Enter the number: ");
        int numFactorial= sc.nextInt();
        BigInteger factorial = BigInteger.ONE;
        for(int i = 1; i <= numFactorial; ++i)
        {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("Factorial of %d is %d ", numFactorial, factorial);

    }
}
