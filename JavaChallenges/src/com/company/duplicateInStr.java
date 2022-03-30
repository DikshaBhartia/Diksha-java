package com.company;

public class duplicateInStr {
    public static void main(String[] args) {
        String str = "Beautiful Scenery";
        int count = 0;
        char[] inp = str.toCharArray();
        System.out.println("Duplicate Characters present in the String are:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (inp[i] == inp[j]) {
                    System.out.println(inp[j]);
                    count++;
                    break;
                }
            }
        }
    }
}

