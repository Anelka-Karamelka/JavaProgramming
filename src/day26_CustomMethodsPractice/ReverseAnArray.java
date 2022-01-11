package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {

        int[]arr={1,2,3,4,5};
        int[]result=reverse(arr);

        System.out.println(Arrays.toString(result));
    }
//reverse the given  array, returns a new array
public static int[] reverse(int[]array){

    int result[]=new int[array.length];

    int j=0;
                       // [1,2,3,4,5
    for (int i = array.length - 1; i >= 0; i--) {//i index number
        result[j++]=array[i];// each element
    }
    return result;
}
    //reverse the given  array, returns a new array
    public static double[] reverse(double[]array){

       double result[]=new double[array.length];

        int j=0;
        // [1,2,3,4,5
        for (int i = array.length - 1; i >= 0; i--) {//i index number
            result[j++]=array[i];// each element
        }
        return result;
    }
    //reverse the given  array, returns a new array
    public static char[] reverse(char[]array){

        char result[]=new char[array.length];

        int j=0;
        // [1,2,3,4,5
        for (int i = array.length - 1; i >= 0; i--) {//i index number
            result[j++]=array[i];// each element
        }
        return result;
    }
    //reverse the given  array, returns a new array
    public static String[] reverse(String[]array){

        String result[]=new String[array.length];

        int j=0;
        // [1,2,3,4,5
        for (int i = array.length - 1; i >= 0; i--) {//i index number
            result[j++]=array[i];// each element
        }
        return result;
    }
}


