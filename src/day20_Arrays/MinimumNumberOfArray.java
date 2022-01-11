package day20_Arrays;

public class MinimumNumberOfArray {

    public static void main(String[] args) {

        int[] number = {5, 6, 20, 3, 9};
        int min= number[0];

        for (int i = 0; i < number.length; i++) {
            if(number[i]<min){
                min=number[i];
            }
        }

        System.out.println(min);


        System.out.println("---------------");

        int[]num = {100, 500, 30, 40, 600, 80,90};
        int minNum = num[0]; //30

        for (int i = 0; i < num.length; i++) {//i : 0,1,2,3...
            if (num[i] < min) { //if there is an element in the array that's smaller
                min=num[i];//smaller number will be assigned to the variable min
            }
        }
        System.out.println(minNum);
    }
}
