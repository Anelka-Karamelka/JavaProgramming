package day20_Arrays;

import java.util.Arrays;

public class ArraysLettersPractice {

    public static void main(String[] args) {

        char[] letters = new char[26]; // z-a

        for (char i = 'Z',j=0; i >='A' && j<=26; i--,j++) {
            letters[j]=i;
        }

        System.out.println(Arrays.toString(letters));
        }   // number of character

        }
/*
  for (int i = month.length - 1; i >= 0; i--) { //i represent lastindex number of Arrays starting from last index
            System.out.println(month[i]);
 */
          /*
       1 VERSION  char ch='A';
        for (int i = 0; i < letters.length; i++,ch++) {
        letters[i]=ch;         }

        2 VERSION
        for (int i = 0,j='A'; i <letters.length ; i++,j++) {
         letters[i]=(char)j;        }

         3 VERSION
         for (char i = 'A',j=0; i <= 'Z'&&j<=letters.length; i++,j++) */






