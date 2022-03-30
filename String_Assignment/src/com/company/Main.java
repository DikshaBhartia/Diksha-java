package com.company;

public class Main {

    public static void main(String[] args) {
        //Strings are immutable
        String str1 = "JAVA";
        String str2 = "JAVA";
        System.out.println(str1 == str2);
        str1 = str1 + "JEE";
        System.out.println(str1 == str2);

    }
}
