package day09_IfStatement;

public class MedianNumber {

    public static void main(String[] args) {
        int a = 20,
                b = 50,
                c = 10;
        // if we have three different numbers, one MUST maximum, one MUST be minimum and one MUST be Median


        //               a= 15, b= 10, c = 20    a = 15, c = 10, b = 20
        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
            /*
            in order for A to be the median number:
                    1. if c is the maximum number & b is the minimum number, then a is the median number
                    2. if b is the maximum number & c is the minimum number, then a is the median number
             */

        //              b=15, a = 20, c = 10,       b= 15,  a = 10, c= 20
        boolean bIsMedian = (b > c && b < a) || (b > a && b < c);
        /*in order of B to be the median number:
         in order to be "B" to be the median number
        1. if C is maximum number & A is the minimum number, then B median number
        2. if A is maximum number & C is the minimum, then B median number
         */


        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if(aIsMedian){
            System.out.println(a +" is Median number");
        }else if(bIsMedian) {
            System.out.println(b + " is Median number");
        }else{
            System.out.println(c +" is Median number");
        }

    }
}