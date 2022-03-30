package com.company;
import java.util.Scanner;

public class averageOfArray {
    public static void main(String[] args) {
        //enter total no. of elements present in array whose average has to be found
        System.out.println("Enter total no. of elements in array: ");
        Scanner scanner = new Scanner(System.in);
        int numArray = scanner.nextInt();
        double[] array = new double[numArray];
        double total = 0;

        for(int i=0; i<array.length; i++){
            System.out.print("Enter Element No."+(i+1)+": ");
            array[i] = scanner.nextDouble();
        }
        scanner.close();
        for(int i=0; i<array.length; i++){
            total = total + array[i];
        }
        double avgArray = total / array.length;
        System.out.format("The average is: %f", avgArray);
    }
}

