package day16_ForLoopString;

public class DigitsLettersSpecialChar {

    public static void main(String[] args) {

        String str = "Cydeo12345School!@#$%WoodenSpoon";

        String digits = ""; //12345 - digits
        String letters = ""; //CydeoSchoolWoodenSpoon
        String specialChar = ""; //!@#$%
        //i <= str.lenght()-1
        for (int i = 0; i < str.length(); i++) { //i: index numbers of str 0 last index

            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {   // if the character between '0' and '9' then its digit
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') { //if the character between 'A' and 'Z' then its letters
                letters += ch;
            } else {// if the char. neither letter neither digit then its special ch
                if(ch != ' ')    // if the special ch is not a space
                specialChar += ch;

            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChar = " + specialChar);
    }
}

/*
 write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

 */