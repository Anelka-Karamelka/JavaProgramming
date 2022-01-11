package day17_While_DoWhile;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String str = "JavaJavaJavaJavaJavaJava";

        int frequency =0;
                           //   8   -  4
        for (int i = 0; i <str.length()-3; i++) { // or we can do i <= str.length()-4
            String eachSub = str.substring(i, i+4);
            //System.out.println(eachSub);
          if(eachSub.equals("Java")){
              frequency++;
          }
        }
        System.out.println(frequency);
    }
}


   /* write a program that can return the frequency of the a word Java from the sentence

        Ex:
        sentence = "Java Java";

        output:
        2

        Hint: you need to create

    */
