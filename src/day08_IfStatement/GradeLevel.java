/*
Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

            Assume that the given number is 1 ~ 18
 */
package day08_IfStatement;

public class GradeLevel {

    public static void main(String[] args) {

        byte level = 18;

        boolean a = level >= 1 && level <= 5;
        boolean b = level >= 6 && level <= 8;
        boolean c = level >= 9 && level <=12;
        boolean d = level >= 13 && level <=16;
        boolean f = level >= 17 && level <=18;


        if(a){
            System.out.println("Elementary school");
        }
        if(b){
            System.out.println("Middle school");
        }
        if(c){
            System.out.println("High school");
        }
        if(d){
            System.out.println("College");
        }
        if(f){
            System.out.println("Grad school");
        }
    }
}
