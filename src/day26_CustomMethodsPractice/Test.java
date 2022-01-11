package day26_CustomMethodsPractice;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=method(scan.next(), scan.next(), scan.next());
        System.out.println(str);
    }

    public static String method(String one, String two,String three){
        return ""+middle(one)+middle(two)+middle(three);

    }
    public static char middle(String s){
        return s.charAt(s.length()/2);
    }
}
