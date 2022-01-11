package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTask {
    public static void main(String[] args) {
/*          INTERVIEW QUESTION
1. write a program that can merge two arrays of integers
        Ex:
            arr1 = {1,2,3,4}
            arr2 = {5,6}

        output
            arr3 = {1,2,3,4,5,6}
 */
        String[] group1 ={"Ali", "Layan", "Aysenur"};//3 elements
        String[] group2 ={"Maria", "Aygun", "Duygu", "Suat", "Valeriy"}; // 5 elements

       String[] students = new String[group1.length+ group2.length]; // 8elements

        int i=0;
        for (String each : group1) { // Ali, LAyan,Aysenur
                    students[i++]=each;
        }
        for (String each : group2) {
            students[i++]=each;
        }
        System.out.println(Arrays.toString(students));

        System.out.println("--------------Char Merge Array Task");


        char [] ch1= {'A','B','C'};
        char [] ch2= {'D', 'E', 'F', 'G','H'};

        char[] chars = new char[ch1.length+ ch2.length];

        int j=0;
        for (char each : ch1) {
            chars[j++]=each;
        }
        for (char each : ch2) {
            chars[j++]=each;
        }
        System.out.println(Arrays.toString(chars));
        }




}
