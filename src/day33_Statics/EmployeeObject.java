package day33_Statics;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1=new Employee();
        employee1.name="Ahmet";
        employee1.salary=110000;

        Employee employee2=new Employee();
        employee2.name="Asel";
        employee2.salary=150000;

        Employee employee3=new Employee();
        employee3.name="Fady";
        employee3.salary=120000;

        System.out.println(employee1.name+" : "+employee1.salary);
        System.out.println(employee2.name+" : "+employee2.salary);
        System.out.println(employee3.name+" : "+employee3.salary);
    }
}
