package day28_ArraysList;

import java.util.ArrayList;

public class MethodGet {
    public static void main(String[] args) {

        ArrayList<Integer> numbers =new ArrayList<>();
        numbers.add(10);//index 0
        numbers.add(20);//index 1
        numbers.add(30);//index 2
        numbers.add(40);//index 3
        numbers.add(50);//index 4
        numbers.add(60);//index 5

        Integer num = numbers.get(3);   // 40
        System.out.println("num = " + num);

        System.out.println("================");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));//10 20 30 40  50 60
        }

    }
}
