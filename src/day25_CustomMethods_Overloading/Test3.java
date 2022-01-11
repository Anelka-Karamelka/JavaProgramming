package day25_CustomMethods_Overloading;

public class Test3 {

    public static void main(String[] args) {
        double n=add(3.4);
        n += add("dual");
        n+=add(Integer.parseInt("100"));
        n+=add(11341L);
        n+=add(Float.parseFloat("50.5"));
        System.out.println(n);
        }

    public static int add(int num){
        return 5;

    }
    public static double add(double d){
        return  2.5;
    }
    public static long add(String s){
        return  10;
    }

}

