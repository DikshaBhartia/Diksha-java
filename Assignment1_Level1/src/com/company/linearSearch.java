package com.company;
import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        int count, num, value, array[];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        num = input.nextInt();
        array = new int[num];
        System.out.println("Enter " + num + " integers");
        for (count = 0; count< num; count++)
            array[count] = input.nextInt();

        System.out.println("Enter the search value:");
        value = input.nextInt();

        for (count = 0; count < num; count++)
        {
            if (array[count] == value)
            {
                System.out.println(value +" is present at location "+(count+1));
                break;
            }
        }
        if (count == num)
            System.out.println(value + " doesn't exist in array.");

        if (count== num)
              System.out.println(value + " doesn't exist in array.");
    }
}
