package com.company;
import java.util.Scanner;

public class CWH_Prob {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Marks in Subject 1: ");
        float sub1=sc.nextFloat();
        System.out.println("Marks in Subject 2: ");
        float sub2=sc.nextFloat();
        System.out.println("Marks in Subject 3: ");
        float sub3=sc.nextFloat();
        System.out.println("Marks in Subject 4: ");
        float sub4=sc.nextFloat();
        System.out.println("Marks in Subject 5: ");
        float sub5=sc.nextFloat();
        float total= (sub1+sub2+sub3+sub4+sub5)/5;
        System.out.println(total);
    }
}

