package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        // double > float > long > int > short > byte

        byte  a = 100; //small
        short b = a;  // large
        //short b =  (short)a;
        //         (short)a

        byte q = 120;
        short p = 10;

        System.out.println(q + ":" + p);


        int c = b; // implicit casting  // int is - large
        // int c = (int)b               // short is - small

        long d = c ;                    // long - large
        //      (long)c                 // int - small

        float e = d;                    // float is - small
        double f = e;                   // double is - large


        System.out.println("------------------------------");

        int x = 55;                              // int is - large
        short y = (short)x; // explicit casting  // short is - small

        System.out.println(x + " : " + y);


        long j = 1000000;               // long is large
        short k =  (short)j;            // short is small

        System.out.println(j+" : "+k);


        double l = 2.5;
        float m =  (float)l;

        System.out.println(l + " : "+m);

        double n = 10.8;
        int s = (int) n; //10

        System.out.println(n + ":" +s);

        System.out.println("----------");

        double d1 = 20.5;
        short s1 = (short) d1;
        System.out.println(d1 +" : " +s1);

        float f1 = 30.5F;
        long l1 = (long) f1;

        float f2 = 31.6F;




    }
}
