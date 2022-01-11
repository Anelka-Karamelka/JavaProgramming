package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {
                System.out.println("COPY METHOD");
        String [] students = {"Elif", "Sinem", "Gunay", "Cihad", "James", "Aron", "Daniel"};
        String [] earlyBirds = Arrays.copyOf(students, 5);

        System.out.println(Arrays.toString(earlyBirds));

        int[] num={1,2,3,4,5,6,7,8,9,10};

        num=Arrays.copyOf(num,5);

        System.out.println( Arrays.toString(num));

        System.out.println("COPY OF RANGE METHOD");

        char [] ch1 = {'A', 'B', 'C', 'D', 'E','F', 'G','H','I'};
        char [] ch2 = Arrays.copyOfRange(ch1,2,6); // => c d e f

        System.out.println(Arrays.toString(ch2));

        int [] scores={10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
                  //   0   1    2   3   4   5   6   7   8   9
        int [] result= Arrays.copyOfRange(scores, 3,7+1);

        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(scores, 5, scores.length);
        System.out.println(Arrays.toString(result2));

    }
}
