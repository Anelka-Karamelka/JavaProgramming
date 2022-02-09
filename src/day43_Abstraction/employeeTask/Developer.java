package day43_Abstraction.employeeTask;

public final class Developer extends Employee{

    public Developer(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps 6 hours");
    }

    @Override
    public void work() {
        System.out.println(getName()+ " developing an application");
    }

    public void unitTest(){
        System.out.println(getName() + " is unit testing");
    }
}
