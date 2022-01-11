package day28_ArraysList;

import java.util.ArrayList;

public class MethodReplace {

    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("Java");   // index 0
        list.add("Python"); // index 1
        list.add("Java");  // index 2
        list.add("C#");   // index 3
        list.add("Ruby"); //index 4

        list.set(2,"JavaScript");//replaced "Java" to "JavaScript"
        list.set(3,"C++");     // replaced "C#" to "C++"
        System.out.println(list);
    }

    }

