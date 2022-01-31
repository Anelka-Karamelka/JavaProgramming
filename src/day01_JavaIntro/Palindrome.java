package day01_JavaIntro;

public class Palindrome {


    public static boolean isPalindrome(String str) {


        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result.equalsIgnoreCase(str);


    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("Anar"));
    }


}
