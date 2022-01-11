package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = 25;
        int num2 = -25;

        System.out.println( num1 < 0 ); //false
        System.out.println( num2 < 0); //true

        int a = 5;
        ++a; // pre increment : increases the value by 1 right away

        System.out.println(a);

        --a; // pre decrement: decreases th value by 1 right away
        System.out.println(a);


        System.out.println("-----------");

        int b = 100;

        System.out.println(++b);  // pre increment : increases the value by 1 right away

        int c = 100;
        System.out.println(c++); // post increment : first passes the current value, then increases yhe value by 1
        System.out.println(c); // 101

        int x = 200;
        System.out.println( --x);  // pre decrement: decreases th value by 1 right away

        int y = 200;
        System.out.println(y--); // post decrement



        int z = 45;
        System.out.println( ++z); //pre increment 46, z =46
        System.out.println( z++); //post increment 46, z =47
        System.out.println( z);   // post inc. 47

        int q = 30;

        System.out.println( --q); // pre decrement q= 29
        System.out.println( q--); // post decrement q=29
        System.out.println(q);    // post decrement q=28


    }
}
