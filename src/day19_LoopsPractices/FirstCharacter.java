package day19_LoopsPractices;

public class FirstCharacter {

    public static void main(String[] args) {

        String str = "ddbbffbdf";

        String result = "";
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    result = "" + (str.charAt(i));
                    frequency++;
                }
            }

                if(frequency==2){
                    break;
                }
            }
        System.out.println(result);
        }


    }

/*
 Write a program that
 can return the first duplicated character from a string
 */
