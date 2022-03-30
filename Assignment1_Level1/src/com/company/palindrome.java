package com.company;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //check whether given word is palindrome or not
        System.out.println("Enter the word: ");
        String word=sc.next();
        String reverseWord= "";
        int wordLength = word.length();

        for (int i = (wordLength - 1); i >=0; --i) {
            reverseWord = reverseWord + word.charAt(i);
        }

        if (word.toLowerCase().equals(reverseWord.toLowerCase())) {
            System.out.println(word + " is a Palindrome String.");
        }
        else {
            System.out.println(word + " is not a Palindrome String.");
        }
    }
}
