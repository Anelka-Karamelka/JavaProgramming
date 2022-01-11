package day10_NestedIf;

import java.sql.SQLOutput;

public class TernariesWithNestedIf {

    public static void main(String[] args) {
        int s= 85;

        /*if(s>=0 && s<=100){
          if(s>=60){
              System.out.println("Passed");
          }else{
              System.out.println("Failed");
          }
        }else{
            System.out.println("Invalid Score");
        }

         */

       String result = (s>=0 && s<=100)? (s>=60)? "Passed" : "Failed" : "Invalid score";
        System.out.println(result);


        /*if (score >= 0 && score <= 100) { //if score is valid

            if (score >= 60) {                //if student passed exam
                System.out.println("Passed");
            } else {                         // if student failed exam
                System.out.println("Failed");
            }

        } else {                              // if the score is not valid
            System.out.println("Invalid score");
        }

         */





    }
}
