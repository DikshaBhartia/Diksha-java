package com.company;

public class StringPractice {
    public static void main(String[] args) {
        //string to lcase
        //String name= "Diksha";
        //System.out.println(name.toLowerCase());

        /*replace spaces with underscore
        String name="D ik s h a    Bh ar t i  a";
        System.out.println(name.replace(" ", "_"));*/

        /*replace letter template
        String letter= "Dear </name>, Thanks a lot";
        String value=letter.replaceAll("</name>", "Diksha");
        System.out.println(value);*/

        //detect double and triple spaces
        /*String name="Di  k   s  h   a   B  h   a  r   t  i   a";
        System.out.println(name.indexOf("  "));
        System.out.println(name.indexOf("   "));*/

        //show as letter
        String letter="Dear Diksha,\n\tThis Java course is nice.\n\tThanks";
        System.out.println(letter);





    }
}
