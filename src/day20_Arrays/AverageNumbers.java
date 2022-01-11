package day20_Arrays;

public class AverageNumbers {
    public static void main(String[] args) {

        int[]number={10,20,30,40,50,60};
        double sum=0; //+10+20+30....

        for (int i = 0; i < number.length; i++) {
            sum+=number[i];
        }

        double averageNumber = sum/ number.length;
        System.out.println("averageNumber = " + averageNumber);

    }

}
