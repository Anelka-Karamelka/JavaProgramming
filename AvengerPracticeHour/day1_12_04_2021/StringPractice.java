package day1_12_04_2021;

public class StringPractice {

    public static void main(String[] args) {

        String word = "Selcuk"; // elcu

      /* String s= word.substring(1,word.length()-1);
        System.out.println(s);*/


      char firstChar= word.charAt(0);
      char lastChar= word.charAt((word.length()-1));
      word=word.replace(firstChar, ' ');
      word=word.replace(lastChar, ' ');
        System.out.println(word);



    }
}
