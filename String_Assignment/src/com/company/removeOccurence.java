package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class removeOccurence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string :");
        String input = scanner.nextLine();
        System.out.println("Enter a letter to be removed: ");
        Character alphabet= scanner.next().charAt(0);
        System.out.println("Final string is: "+removeOccurences(input,alphabet));
    }
    private static String removeOccurences(String input, Character character) {
        ArrayList<Character> arrList=new ArrayList<>();
        for(int i=0;i<input.length();i++)
        {
            char ch = input.charAt(i);
            if(ch != character)
            {
                arrList.add(ch);
            }
        }
        StringBuilder stringBuilder=new StringBuilder();
        for(char c:arrList)
        {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}

