package com.company;
import java.util.Scanner;

public class conditionaloperatorPractice {
    public static void main(String[] args) {
        //program throws error
       /* int a=10;
        if(a=11) {
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }*/

        //student pass or fail
        /*Scanner sc =new Scanner(System.in);
        System.out.println("Marks in sub1");
        int m1= sc.nextInt();
        System.out.println("Marks in sub2");
        int m2=sc.nextInt();
        System.out.println("Marks in sub3");
        int m3=sc.nextInt();
        float total=m1+m2+m3/3f;
        System.out.println("Total marks: " + total);
        if(total>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }*/

        //income tax slabs
        /*Scanner sc= new Scanner(System.in);
        System.out.println("Enter the input amount in lakhs per annum");
        float amt=sc.nextFloat();
        float tax=0f;
        if(amt<2.5f) {
            tax=tax+0f;
        }
        else if(amt>=2.5f && amt<=5f) {
            tax=tax+0.05f*(amt-2.5f);
        }
        else if(amt>=5f && amt<=10f){
            tax=tax + 0.05f*(2.5f-5f);
            tax=tax+0.2f*(amt-5f);
        }
        else if(amt>10f){
            tax=tax+0.05f*(2.5f-5f);
            tax=tax+0.05f*(5f-10f);
            tax=tax+0.3f*(amt-10f);
        }
        System.out.println("The amount of tax paid is: " + tax);*/

        //day of week
        /*Scanner sc= new Scanner(System.in);
        System.out.println("Enter the digit to find day");
        int day=sc.nextInt();
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Good Day");
         }*/

        //leap year or not
        /*Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year");
        int year= sc.nextInt();
        int value= year%4;
        if(value==0){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("Not a leap year");
        }*/

        //type of website
        /*Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Website Name");
        String website= sc.next();
        if(website.endsWith(".com")){
            System.out.println("Commercial Organization");
        }
        else if(website.endsWith(".org")){
            System.out.println("Organization Website");
        }
        else if(website.endsWith(".in")){
            System.out.println("Indian Website");
        }*/







    }
}
