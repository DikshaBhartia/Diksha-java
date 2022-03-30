package com.company;
import java.util.Scanner;

public class emptyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("The given String is " + isNullEmpty(str));
    }
    public static String isNullEmpty(String str) {
        if (str == null) {
            return "NULL";
        }
        //whether string empty or not
        else if (str.isEmpty()) {
            return "EMPTY";
        } else {
            return "neither NULL nor EMPTY";
        }
    }
}
    