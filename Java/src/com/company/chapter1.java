package com.company;
import java.util.Scanner;

public class chapter1 {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc= new Scanner(System.in);
        System.out.println("The first number: ");
        int firstnum= sc.nextInt();
        System.out.println("The second number: ");
        int secondnum= sc.nextInt();
        int sum= firstnum+secondnum;
        System.out.println("The sum of two numbers: ");
        System.out.println(sum);

        // can use float ,byte etc instead of int
     //   boolean c=sc.hasNextInt();
     //   System.out.println(c);

    }

}
