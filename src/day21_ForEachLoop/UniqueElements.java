package day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {
        String[] words = {"Layan", "Layan", "Oleksandr", "Olga",
                "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};

        for (String each : words) { // each: represents each elements
            int count = 0;

            for (String element : words) { //compares each elements
                if (element.equals(each)) {
                    count++;
                }

            }

            if (count == 1) {
                System.out.println(each);

            }
        }
        System.out.println("------------");


        }
    }


