package day33_Statics;

import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {

        Student student1=new Student("Ahmet");

        Student student2=new Student("Ahmet", 'F');

        Student student3=new Student("Nella", 11);

        Student student4=new Student("Mert", 12, 'B');

        Student student5=new Student("Cihad", 'M',28);

        Student student6=new Student("Olek", 'M', 28, 145);

        Student student7=new Student("Suhaub", 'M', 36, 563,'B');

        System.out.println(student1==student2);

        Student[]students={student1,student2,student3,student4,student5,student6,student7};

        System.out.println(Arrays.toString(students));


       /* System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
        System.out.println(student7);*/
    }
}
