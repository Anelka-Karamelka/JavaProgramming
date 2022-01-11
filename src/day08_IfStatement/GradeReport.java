package day08_IfStatement;

public class GradeReport {

    public static void main(String[] args) {

        int score = 85; //0~100
        boolean a = score >= 90 && score<= 100; //false
        boolean b = score >= 90 && score <= 89; // true
        //boolean b = score >=80 && !a;  if student is a, but score is greater than 80 - another way writing

        boolean c = score >= 70 && score <=79; //false
        //boolean c = !a && !b score >=70 - another command

        boolean d = score >= 60 && score <=69; //false

        boolean f = !a && !b && !c && !d; //false
        // boolean f = score >=0 && score <=59;

        if(a){ // if the student made A
            System.out.println("Excellent");
        }

        if(b){ //if the student made B
            System.out.println("Great");
        }

        if(c) { //if the student made C
            System.out.println("Good");
        }

        if(d) { //if the student made D

            System.out.println("Passed");

        }

        if(f) {  // if the student made F

            System.out.println("Failed");
        }




    }
}


/* score:
90~100 == Excellent
80~89 ==> Great
70~79 ==> Good
60~69==> Passed
0~59 ==>

 */