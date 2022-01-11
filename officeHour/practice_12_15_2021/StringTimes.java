package practice_12_15_2021;

import java.util.Scanner;

public class StringTimes {
    public static void main(String[] args) {

  /*Given a string and a non-negative int n,
  return a larger string that is n copies of the original string.
   input String : Hi  ,  input int : 3
        output: HiHiHi*/
        Scanner input =new Scanner(System.in);
        System.out.println("enter any word:");
        String word=input.nextLine();
        System.out.println("enter any positive number:");
        int num= input.nextInt();

        int count=0;

        String sum="";

       /* while(count<num){
            sum+= word; // sum -is "Ho"+"Ho"=HoHo
            count++;
        }
        System.out.println(sum);*/

        System.out.println("====================");
        for (int i = 0; i < num; i++) {
            sum+= word;
            
        }
        System.out.println(sum);
    }
}
