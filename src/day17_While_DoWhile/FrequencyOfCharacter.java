package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "AAABBBC";
        char ch = 'A';

        int frequency = 0;
        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i); // eachChar: each character of str

            // 'A' == 'A'
            if(ch == eachChar) { // if given char is matching with the eachChar, then ch is apperaed
                frequency ++;
                //frequency +=1

            }
        }
        System.out.println(frequency);


    }
}


    /*Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
        Ex:
        inputs:
        str = "aabcccd";
        char = 'c';

        output: 3

     */
