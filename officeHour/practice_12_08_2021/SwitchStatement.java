package practice_12_08_2021;

public class SwitchStatement {
    public static void main(String[] args) {
        /* Create  a program that accepts animal as String

                            DOG     - domestic animal
                            CAT     - domestic animal
                            TIGER     - wild  animal

                            For other animal - unknown animal

                            INPUT : DOG         EXPECTED OUTPUT : DOG is domestic animal */


        String animal ="CAT";

        String result ="";

        switch (animal){
            case "DOG":
            case "CAT":
                result = "Domestic animal";
                break;
            case "TIGER":
                result = "Wild Animal";
                break;
            default:
                result = "Unknown animal";
                break;
        }
        System.out.println(result);
    }
}
