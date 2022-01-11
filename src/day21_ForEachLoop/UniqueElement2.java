package day21_ForEachLoop;

public class UniqueElement2 {
    public static void main(String[] args) {
        String[] words = {"Layan", "Layan", "Oleksandr", "Olga",
                "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};

        int count =0;

        for (String element : words) {
            if(element.equals("Adam")){
                count++;
            }
        }
        if(count==1){
            System.out.println(count);
        }
    }
}
