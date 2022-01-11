package day03_EscapeSequences;


/*
Escape Sequences: must be given with double quote
 \n: start a new line
 \t: tab paragraph space
 \\: prints single slash
 \*: double quote
 */
public class EscapeSequences {


    public static void main(String[] args) {

        System.out.println("Java \nPython \nC#");

        System.out.println("---------------");

        System.out.println("Hello Cydeo How are you all today? \nIt's nice to see you all. \nWhat class do we have next week?");

        System.out.println("------------------------");
        System.out.println("\tJava is cool programming Language");

        System.out.println("---------------");

        System.out.println("/ \\");   //in order to print one backslash we need to give two backward slash

        System.out.println("----------------------");
        System.out.println("My favourite TV show is \"Game of Thrones\""); //in order to print double quote we need to do backward quote 

    }
}
