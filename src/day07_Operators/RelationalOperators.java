package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {
        boolean price = 48 < 29;   //false
        System.out.println("price = " + price);

        boolean price1 = 20.5 < 20.6;  //true
        System.out.println("price1 = " + price1);

        boolean result1 = 20 > 40; // false
        System.out.println("result1 = " + result1);

        boolean result2 = 300>= 150;   //true
        System.out.println("result2 = " + result2);

        boolean result3 = 100>=100;     //true
        System.out.println("result3 = " + result3);

        boolean result4 = 300 >=500; // false

        //credit score of 720
        int creditScore = 745;
        boolean isEligibleForLoan = creditScore >=720; // if the credit score is 720 or greater then it's eligible

        boolean result5 = 100 < 120;  //true

        int x =100;
        int y =200;

        boolean equal = x == y; //false
                        //100 ==200
        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar" == "Good Guy" ; //false
        System.out.println("result8 = " + result8);

        boolean result9 = 'A' == 'a'; //false
        System.out.println("result9 = " + result9);

        boolean result10 = "Java" == "Java";
        System.out.println("result10 = " + result10);
        
        boolean result11 = 100 != 200; // true
        System.out.println("result11 = " + result11);
        
        boolean result12 = "Java" != "Break"; //true
        System.out.println("result12 = " + result12);
        
        boolean result13 = 300 != 300; //false
        System.out.println("result13 = " + result13);








    }
}
