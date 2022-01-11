package day19_LoopsPractices;

public class UniqueCharacter {
    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";  // bdf - unique character

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); //'a'
            int count = 0; //represents frequency

            for (int i = 0; i < str.length(); i++) {   // compares the character that outer loop picked, with each char
                char each = str.charAt(i);    //each char of str
                if (ch == each) {
                    count++;
                }
            }
            if (count == 1) { //if the frequency of the character is 1, then char is unique;
                result += ch;
            } // if(count !=1){
                //continue;

        }
        System.out.println(result);
    }
}

/*
5. Write a program that can find the unique characters
from a string without using index() and lastIndexOf() methods
  Ex:
 str = "aabccdeef";
  output:
     bdf
 Hint: if you find out how to find the frequency of one character,
 then you can repeat it for the remaining characters to find the frequency.
   if frequency of a character == 1  =========> unique
 */