package day15_ForLoop;

import java.util.Scanner;

public class ReplaceTask {

    public static void main(String[] args) {

        System.out.println("Enter a word");
        String word = new Scanner(System.in).nextLine();// xcodex

        if(word.charAt(0)=='x'){
            word = word.replaceFirst("x", "a"); // "acodex"
        }
        System.out.println(word);






    }
}
/*
1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */