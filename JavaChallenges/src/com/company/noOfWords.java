package com.company;
import java.util.Scanner;

public class noOfWords {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Sentence whose word count is to be determined
        System.out.println("Enter the Sentence: ");
        String inputSen= sc.nextLine();
        int wordPresent=0;
        for(int i = 0; i < inputSen.length()-1; i++) {
            if(inputSen.charAt(i) == ' ' && Character.isLetter(inputSen.charAt(i+1)) && (i > 0)) {
                wordPresent++;
            }
        }
        wordPresent++;
        System.out.println("Total number of words present : " + wordPresent);
    }
}
