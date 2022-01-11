package day16_ForLoopString;

public class Palindrome {
    public static void main(String[] args) {

        String word = "Anna";
        String reversed = "";
        for (int i = word.length()-1; i>=0; i--) {
            reversed+=word.charAt(i);
        }
        boolean isPalindrome=word.equalsIgnoreCase(reversed);
        System.out.println(isPalindrome);

        System.out.println("---------------");

        String word1 = "Level";
        String reversed1 = "";
        for (int i = word1.length()-1; i>=0; i--) {
            reversed1+=word1.charAt(i);
        }
        boolean isPalindrome1=word1.equalsIgnoreCase(reversed1);
        System.out.println(isPalindrome1);
    }
}
/*
8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level
				output:
					true

				input:
					Anna
				output:
					true
 */