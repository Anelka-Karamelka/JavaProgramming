package day1_12_04_2021;

public class StringExamples {

    public static void main(String[] args) {
        /*
        Given a string "Hello" we need to get "HE"*/


        String str = "Hello";
        str=str.toUpperCase();
        String s = "" + str.charAt(0) + str.charAt(1);
        System.out.println("s = " + s);



        String str1 = "Hello";
        str1=str1.toUpperCase();
        str1=str1.substring(0,2).toUpperCase();
        System.out.println("str1 = " + str1);
    }
}
