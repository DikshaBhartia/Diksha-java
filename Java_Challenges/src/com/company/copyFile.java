package com.company;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copyFile {
    public static void main(String[] args) {
        FileInputStream Fread =new FileInputStream("Hello.txt");
        FileOutputStream Fwrite=new FileOutputStream("Hello1.txt") ;
        System.out.println("File is Copied");
        int c;
        while((c=Fread.read())!=-1)
            Fwrite.write((char)c);
        Fread.close();
        Fwrite.close();
    }
}
