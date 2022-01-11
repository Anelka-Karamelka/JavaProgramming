package day11_Switch_Scanner;

public class SwitchCharExample {


    public static void main(String[] args) {

        char ch = 'F'; // ==

        switch (ch) {

            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great Job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");

        }
                System.out.println("-------------");  // or


                char ch1 = 'B';// ==
                String result = "";

                switch (ch1) {
                    case 'A':
                        result = "Excellent";
                        break;

                    case 'B':
                        result = "Great Job";
                        break;

                    case 'C':
                        result = "Good";
                        break;

                    case 'D':
                        result = "Passed";
                        break;

                    case 'F':
                        result = "Failed";
                        break;

                    default:
                        result = "Invalid";

                }

                System.out.println(result);


        System.out.println("---------------");

        byte a =104;
       boolean check = a <100;

       if (183==13+50*2+70){
           System.out.println("a");
       }else{
           System.out.println("ab");
       }




               }
       }





