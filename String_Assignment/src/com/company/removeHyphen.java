package com.company;
import java.util.Scanner;

public class removeHyphen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Statement: ");
        String strStatement=sc.nextLine();
        int length = strStatement.length();
        String out = strStatement.replaceAll("[^0-9\\+]", "");
        System.out.println("The final line without hyphen: " + out);

    }
    static int replaceAll(char []str)
    {
        int count = 0;
        for (int i = 0; i<str.length; i++)
            if (str[i] != '-')
                str[count++] = str[i];

        return count;
    }
}
