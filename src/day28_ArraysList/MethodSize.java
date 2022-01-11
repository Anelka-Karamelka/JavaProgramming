package day28_ArraysList;

import java.util.ArrayList;

public class MethodSize {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);//index 0
        numbers.add(20);//index 1
        numbers.add(30);//index 2
        numbers.add(40);//index 3
        numbers.add(50);//index 4
        numbers.add(60);//index 5

        System.out.println(numbers.size()); // element size is 6
        int lastIndex=numbers.size()-1;    // size is 5 now
        System.out.println("lastIndex = " + lastIndex);
    }
}