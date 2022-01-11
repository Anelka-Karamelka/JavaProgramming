package day15_ForLoop;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {

        System.out.println("Enter a word");
        String str = new Scanner(System.in).nextLine();// "xcodeX

        String result = str.replace("x", "a").replace("X", "a");
        //acodeX                //acodea
        System.out.println(result);
    }
}




    /*Write a program that asks user to enter a word. and replace all the x or X with character a
        Input:
        xcodeX
        Output:
        acodea

     */