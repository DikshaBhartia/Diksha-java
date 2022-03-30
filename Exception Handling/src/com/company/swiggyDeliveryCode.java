package com.company;
import java.util.Scanner;

class MyExecution extends Exception{
    @Override
    public String toString(){
        return "Can't deliver to this area";
    }
    @Override
    public String getMessage(){
        return "Delivers to this area!!";
    }
}

public class swiggyDeliveryCode {
    public static void main(String[] args) {
        int zipCode;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Zip Code of the area: ");
        zipCode=sc.nextInt();
        if(zipCode==123|| zipCode==456|| zipCode==789){
            try{
                throw new MyException();
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
        }

    }
}
