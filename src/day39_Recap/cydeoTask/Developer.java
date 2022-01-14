package day39_Recap.cydeoTask;

import java.sql.SQLOutput;

public class Developer extends Employee  {
// developer child of employee
    //person granparent of developer


    public Developer(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void fixingBug(){
        System.out.println(getJobTitle()+" "+getName()+" is fixing the bug");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is developing application");
    }
}
/*
  4. Create a sub class of Employee named Developer

            Override the work method

            Extra methods:
                fixingBugs()
 */