package com.company;
import java.util.Scanner;

public class discountAmount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the initial price: ");
        double initialPrice= sc.nextDouble();
        System.out.println("Enter the Discount percentage: ");
        double discountPct= sc.nextDouble();
        double disAmt= (discountPct/100)*initialPrice;
        double sellingPrice= initialPrice-disAmt;
        System.out.println("Discount Amount is: " + disAmt);
        System.out.println("Selling Price of item is: " + sellingPrice);
    }
}
