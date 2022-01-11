package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {
        //store ten elements: 10, 20,50,70

        int[] number = {10, 20, 50, 70}; // size is: 4

        System.out.println(Arrays.toString(number));

        System.out.println("-------------------------");

        //create a varibale that can contain 5 scores

        int[] scores = new int[5]; // [0 0 0 0 0]
        scores[1] = 85;
        scores[scores.length - 1] = 95;
        scores[3] = 75;
        scores[0] = 65;
        scores[2] = 55;

        System.out.println(Arrays.toString(scores)); // [65,85,55,75,95]

        System.out.println("---------------------------");
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};

        /*System.out.println(month[0]);
        System.out.println(month[1]);
        System.out.println(month[2]);
        System.out.println(month[3]);
        System.out.println(month[4]);
        System.out.println(month[5]);
        System.out.println(month[6]);
        System.out.println(month[7]);
        System.out.println(month[8]);
        System.out.println(month[9]);
        System.out.println(month[10]);
        System.out.println(month[11]);*/      //or i<=11
        for (int i = 0; i < month.length; i++) {//i represent index number of array starting from0
            System.out.println(month[i]);
        }


        System.out.println("-----------------------");


        for (int i = month.length - 1; i >= 0; i--) { //i represent lastindex number of Arrays starting from last index
            System.out.println(month[i]);
        }

    }
}