package day28_ArraysList;

import java.util.ArrayList;

public class MethodIndexOf {
    public static void main(String[] args) {


        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a =characters.indexOf('A'); // index is 0
        int b= characters.lastIndexOf('A'); //index is 4

        System.out.println(a);
        System.out.println(b);
    }
}
