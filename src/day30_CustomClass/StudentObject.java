package day30_CustomClass;

import java.util.ArrayList;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Nelly", 'F', 26, 1256, 'A');


        Student student2 = new Student();
        student1.setInfo("Kevin", 'M', 30, 1235, 'F');



        Student student3 = new Student();
        student1.setInfo("Leyla", 'F', 20, 2569, 'B');


        Student student4 = new Student();
        student1.setInfo("Max", 'M', 25, 1878, 'C');


        Student student5 = new Student();
        student1.setInfo("Mert", 'M', 29, 1478, 'C');


        Student[] students = {student1, student2, student3, student4, student5};

        for (Student each : students) {
            System.out.println(each);
        }

        System.out.println("=========================");

        ArrayList<Student>earlyBirds=new ArrayList<>(); // grade A
        ArrayList<Student>angryBirds=new ArrayList<>(); // grade A

        for( Student student : students){
            if(student.grade== 'A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }
        }
        System.out.println(earlyBirds);
        System.out.println(angryBirds);
    }


}
