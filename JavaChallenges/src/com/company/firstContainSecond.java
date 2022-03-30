package com.company;
import java.util.Scanner;

public class firstContainSecond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //two string user input to check whether second contain first
        System.out.println("First String Input: ");
        String stringUser= sc.nextLine();
        System.out.println("Second String Input: ");
        String secStringUser= sc.nextLine();

        boolean output = stringContainsSubstring(stringUser, secStringUser);
        System.out.println(stringUser + " contains " + secStringUser + " = " + output);
    }

    private static boolean stringContainsSubstring(String string, String substring) {
        boolean result = false;
        result = string.contains(substring);
        return result;
    }

}