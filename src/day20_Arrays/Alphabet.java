package day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        // create 26 character(elements) in separate indexes

        char[] alphabet= new char[26]; //Z~A
                // i   ch
        /*alphabet[0]='Z'; //90
        alphabet[1]='Y'; //89
        alphabet[2]='X';*/
        char ch = 'Z';
        for (int i = 0; i < alphabet.length; i++, ch--) {
            alphabet[i]=ch;
        }

        System.out.println(Arrays.toString(alphabet)); // print the whole array
        System.out.println(alphabet[0]);        //printing the element of array

        System.out.println("--------------------------------------");





    }
}
