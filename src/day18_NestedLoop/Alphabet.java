package day18_NestedLoop;

public class Alphabet {

    public static void main(String[] args) {

            for (char a = 'A'; a < 'F'; a++) {
                for (char b = 'a';  b <= 'z'; b++) {
                    System.out.print(a+(b+" "));
                }
                System.out.println("");
            }
        }
    }

