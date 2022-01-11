package day16_ForLoopString;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str = "aaabccc";
        String result = "";
                       //i<str.length()
        for(int i = 0; i<=str.length()-1; i++) {//i: index numbers of str (starting from 0)

            char ch = str.charAt(i);// char representing each character of str
            if (str.indexOf(ch) == str.lastIndexOf(ch)) { // if the first and last index numbers of characters are same then it is unique
                result += ch;
            }

        }
        System.out.println(result);

        /*char ch = 'b';
                  //3       == //3

         */





    }
}
/*
Write a program that can return the unique characters from a String
Ex:
     input:
      AABCCD
      output:
       BD

            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique
 */
