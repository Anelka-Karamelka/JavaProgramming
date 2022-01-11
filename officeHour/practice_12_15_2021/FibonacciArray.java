package practice_12_15_2021;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many fibonacci do u want to see?");
        int number = input.nextInt();

        int[] fibonacci=new int[number];
        fibonacci[0]=0;
        fibonacci[1]=1;

        for (int i=2;i<number;i++){
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
        }
        System.out.println(Arrays.toString(fibonacci));



    }
}
