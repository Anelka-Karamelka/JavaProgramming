package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main(String[] args) {
String []countries = {"Japan", "Korea", "United States", " Turkey", "United Kingdom", "Canada"};

//converting array to ArrayList

        ArrayList<String> list=new ArrayList<>(Arrays.asList(countries));
        list.removeIf(p-> p.length() >=10);

// converting ArrayList back to Array

        countries = list.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));



    }
}

// 1.create an Array of String called countries
//2. write a program that can remove all the country names that have length of 10 or greater
