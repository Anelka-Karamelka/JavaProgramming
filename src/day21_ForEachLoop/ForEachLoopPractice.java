package day21_ForEachLoop;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        String words [] = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early birds", "Angry Birds"};

        for (String each : words) { // represents each elements
            System.out.println(each.charAt(0)+""+each.charAt(each.length()-1));

        }
    }
}
