package day12_Scanner;


import java.util.Scanner; // * - wild import: imports everything from the package
                         // scanner - regular import  - imports just one class
public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number between 1 to 7:");
       int num = (byte) scan.nextInt();

       String result = "";    // temporary value prevent error

       if(num>=1 && num<=7){   //7
           result = (num==1)? "Monday" :(num==2)? "Tuesday" :(num==3)? "Wednesday"
                   :(num==4)? "Thursday" :(num==5)? "Friday" :(num==6)? "Saturday"
                   : "Sunday";

       }else{
           result = "Invalid number";
       }
        System.out.println(result);

       scan.close();

    }
}
