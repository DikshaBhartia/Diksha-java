package com.company;
import java.util.Scanner;

public class numberInWords {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int len= args.length;
        if(len==0){
            System.out.println("String is Empty");
            return;
        }
        String[] single_digit = new String[] {
                "zero", "one", "two",   "three", "four",
                "five", "six", "seven", "eight", "nine"
        };
        System.out.print(String.valueOf(args) + ": ");
        if (len == 1) {
            System.out.println(single_digit);
            return;
        }
    }
}
