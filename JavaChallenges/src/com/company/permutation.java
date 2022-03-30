package com.company;

public class permutation {
    static void permute(String s , String answer){
        if (s.length() == 0)
        {
            System.out.print(answer + "  ");
            return;
        }

        for(int i = 0 ;i < s.length(); i++){
            char input = s.charAt(i);
            String leftstr = s.substring(0, i);
            String rightstr = s.substring(i + 1);
            String full = leftstr + rightstr;
            permute(full, answer + input);
        }
    }

    public static void main(String[] args) {
        //input whose permutations are to be found out
        String inputStr="GOD";
        String answer="";
        System.out.print("All possible Permutations of GOD are : \n");
        permute(inputStr, answer);
    }
}