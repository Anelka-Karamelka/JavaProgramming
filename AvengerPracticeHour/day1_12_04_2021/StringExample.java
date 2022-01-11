package day1_12_04_2021;

public class StringExample {

    public static void main(String[] args) {
        /*
        Create a methods print a new string
        made of 3 copies of the last 2 chars of the original string.
        String length will be at least 2.
         */

        String word = "CYDEO";
        String s = word.substring(3).toUpperCase().repeat(3);
        System.out.println(s);

                //    01234
        String word1="CYDEO"; //5-1=4
        int lastIndexOfChar = word1.length() - 1;
                              //5-2=3
        int lastSecondOfChar = word1.length() - 2;
        String result=""+word1.charAt(lastSecondOfChar)+word1.charAt(lastIndexOfChar);
        System.out.println(result+result+result);


        String word2="CYDEO";
        int secondOfChar = word2.length()-2;
        String chars = word2.substring(secondOfChar);
        System.out.println(chars.repeat(3));
    }
}
