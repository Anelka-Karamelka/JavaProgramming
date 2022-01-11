package day20_Arrays;

import java.util.Arrays;

public class ArrayPracticeWithLoop {

    public static void main(String[] args) {

        //

        char[] letters = new char[26];

        /*letters[0]='A';
        letters[1]='B';
        letters[2]='C';*/

        /*
       1 VERSION  char ch='A';
        for (int i = 0; i < letters.length; i++,ch++) {
        letters[i]=ch;         }

        2 VERSION
        for (int i = 0,j='A'; i <letters.length ; i++,j++) {
         letters[i]=(char)j;        }

         3 VERSION
         for (char i = 'A',j=0; i <= 'Z'&&j<=letters.length; i++,j++) */

        for (char i = 'A', j = 0; i <= 'Z' && j < letters.length; i++, j++) {
            letters[j] = i;//j: index number 0~ last index
                          //i: number of character

            /*  for (int i = 0, j <'A'; i<=letter.length && j<='Z',i++,j++) {*/

            System.out.println(Arrays.toString(letters)); //[A-Z]

        }


        System.out.println("---------------------------");


    }}
