package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {

        int numbers [] ={10,20,30,40};
                     //  0  1  2   3
       int reversed[]=new int[numbers.length];
       //        j          i
      /* reversed[0]=numbers[3];
        reversed[1]=numbers[2];
        reversed[2]=numbers[1];
        reversed[3]=numbers[0];*/

        for (int i = numbers.length - 1, j=0; i >= 0; i--, j++) {
            reversed[j]=numbers[i];
        }
        System.out.println(Arrays.toString(reversed));
            }

        }



/*
 Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};
        output:
            reversedArray = {5,4,3,2,1};

 */