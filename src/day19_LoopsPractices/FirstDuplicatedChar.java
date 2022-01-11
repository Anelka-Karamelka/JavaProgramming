package day19_LoopsPractices;

public class FirstDuplicatedChar {

    public static void main(String[] args) {
        String str = "ddbbffdbf"; //d3b3f3
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);   //each character from string
            int count=0;

        for (int i = 0; i < str.length(); i++) { // frequency of char
            char each= str.charAt(i);  //ech character from string
            if(ch==each){
                count++;
            }
        }
        if(result.contains(""+ch)){
            continue;
        }
        result+=ch;
        result+=count;

        }

        System.out.println(result);



        }
    }

/*
1. Write a program that can return
the first duplicated character from a string
 */
