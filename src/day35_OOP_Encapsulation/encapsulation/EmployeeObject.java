package day35_OOP_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {


        Employee e1=new Employee("Tati", 'F', 26, 100000);

        e1.setAge(32);
        System.out.println(e1);

        Employee e2=new Employee("Asya", 'M', 20, 120000);
        e2.setName("Elvira");
        e2.setSalary(e2.getSalary()+15000);
        System.out.println(e2);
    }
}
