package day16_ForLoopString;

public class RemoveDuplicateTask {
    public static void main(String[] args) {
        String str = "aabbaacc";
        // abc - final result
        String result = ""; //abc
        for (int i = 0; i <= str.length() - 1; i++) { //i:represents all index number of str starting from 0
            //int i =0; i<str.length(); i++)   ==> ---- another version
            String ch = "" + str.charAt(i);// represents each character of the string

            if (!result.contains(ch)) { // if the character is not contained in the result
                result += ch;                        // the character will be added to the result

            }

        }
        System.out.println(result);

    }
}


/*Write a program that can remove the duplicated characters from a String
            Ex:
               input:
               AABBCCBC

                Output:
                 ABC
 Hint: You can add each characters of the string into another String
Condition: the character is not contained in the other String yet before you are adding

 */