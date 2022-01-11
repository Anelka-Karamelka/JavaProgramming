package day20_Arrays;

import java.util.Arrays;

public class Number_100 {

    public static void main(String[] args) {

        int[] number = new int[100];

        for (int i = 0; i < number.length; i++) {
             number[i]=i+1;
        }
        System.out.println(Arrays.toString(number));
    }


}
/*1. create an array that has the numbers 1 to 100*/