package com.company;
import java.util.Scanner;

public class cylinderVolume {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius of Cylinder(in cm): ");
        double radius= sc.nextDouble();
        System.out.println("Enter the Height of Cylinder(in cm): ");
        double height= sc.nextDouble();
        double volume=Math.PI*(radius*radius)*height;
        System.out.println("Volume of Cylinder is: " + volume);

    }
}
