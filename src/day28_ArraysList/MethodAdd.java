package day28_ArraysList;

import java.util.ArrayList;

public class MethodAdd {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);//index 0
        numbers.add(20);//index 1
        numbers.add(30);//index 3
        numbers.add(40);//index 4
        numbers.add(50);//index 5
        numbers.add(60);//index 6

        numbers.add(2, 25);//2
        numbers.add(5, 45);
        System.out.println(numbers);
    }
}