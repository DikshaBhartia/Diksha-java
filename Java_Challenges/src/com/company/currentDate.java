package com.company;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class currentDate {
    public static void main(String[] args) {
        DateFormat current = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date currDate = new Date();
        System.out.println(current.format(currDate));

    }
}
