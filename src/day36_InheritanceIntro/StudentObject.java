package day36_InheritanceIntro;

public class StudentObject {

    public static void main(String[] args) {

        Student student1=new Student("Dan", 29,'M', 'D', "MIT");
        student1.setAge(39);
        System.out.println(student1);
    }
}
