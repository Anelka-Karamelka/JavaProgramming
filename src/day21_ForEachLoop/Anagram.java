package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
//write a program that can check if to string are build out same character
        String str1="abdb";
        String str2="dbca";
        char[] char1=str1.toCharArray();
        char[] char2=str2.toCharArray();

        // System.out.println(Arrays.toString(char1));
        //System.out.println(Arrays.toString(char2));

        Arrays.sort(str1.toCharArray());
        Arrays.sort(str2.toCharArray());

boolean anagram = Arrays.equals(str1.toCharArray(),str2.toCharArray());
        //write

        System.out.println("anagram = " + anagram);
    }
}
