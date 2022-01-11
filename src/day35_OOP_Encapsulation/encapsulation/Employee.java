package day35_OOP_Encapsulation.encapsulation;


public class Employee {

    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name,char gender, int age, double salary){
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.err.println("Invalid name" + name);
            System.exit(0);
        }
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender =='F' || gender =='M')){
            System.err.println("Invalid gender" + gender);
            System.exit(0);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }
//                       15
    public void setAge(int age) {
        if(age <=0 || age>150){
            System.err.println("Invalid age" + age);
            System.exit(0);
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            System.err.println("Invalid salary" + salary);
            System.exit(0);
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
/*
1. create an employee class:
private variables: name, gender, age, salary
encapsulate all the private fields
1. Name can not be empty
2. Gender cant be anything other than female or male
3. age can not be zero, negative, or greater than 150
4. salary can't be zero or negative
 */