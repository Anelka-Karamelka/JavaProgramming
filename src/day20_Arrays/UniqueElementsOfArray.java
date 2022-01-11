package day20_Arrays;

public class UniqueElementsOfArray {

    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C#", "Python", "Python"};

        for (int j = 0; j < words.length; j++) {

            String element = words[j]; //"Java" -every single element will be compare
            int frequency =0;

            for (int i = 0; i < words.length; i++) { //finds the frequency of the element from array
                if(words[i].equals(element)){ // i is each element
                    frequency++;
                }
            }
            if(frequency==1){
                System.out.println(element);
            }

        }








    }
}
