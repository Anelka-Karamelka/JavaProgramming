package day28_ArraysList;

import java.util.ArrayList;

public class MethodsContains {
    public static void main(String[] args) {

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        boolean r2=characters.contains('A'); // true
        boolean r3 =characters.contains('Z'); //false

        System.out.println(r2);
        System.out.println(r3);

    }
}
