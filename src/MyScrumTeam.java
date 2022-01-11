import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {


        //4 testers objects

        day31_Constructors.scrumTask.Tester tester1=new day31_Constructors.scrumTask.Tester("Anelya","SDET", 05, 200000);
        day31_Constructors.scrumTask.Tester tester2=new day31_Constructors.scrumTask.Tester("Sandra","QA", 12, 150000);
        day31_Constructors.scrumTask.Tester tester3=new day31_Constructors.scrumTask.Tester("Ali","SE", 42, 142000);
        day31_Constructors.scrumTask.Tester tester4=new day31_Constructors.scrumTask.Tester("Aisha","SDET", 17, 115000);

        day31_Constructors.scrumTask.Tester[] testers={tester2,tester3,tester4};

        // 4 developers objects
        day31_Constructors.scrumTask.Developer developer1=new day31_Constructors.scrumTask.Developer("Olga", "Java Developer", 22, 125000);
        day31_Constructors.scrumTask.Developer developer2=new day31_Constructors.scrumTask.Developer("Aygun", "Java Master", 29, 150000);
        day31_Constructors.scrumTask.Developer developer3=new day31_Constructors.scrumTask.Developer("Tunc", "Software Developer", 42, 145000);
        day31_Constructors.scrumTask.Developer developer4=new day31_Constructors.scrumTask.Developer("Sinem", "Senior Developer", 62, 120000);

        day31_Constructors.scrumTask.Developer[] developers={developer2,developer3,developer4};


        // 1 Scrumteam object

        day31_Constructors.scrumTask.ScrumTeam scrum=new day31_Constructors.scrumTask.ScrumTeam("Nigara", "Hussein", "Neira", 14);

        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);


        scrum.addTesters(testers);
        scrum.addDeveloper(developers);
        System.out.println(scrum);


        System.out.println("============================");
        for(day31_Constructors.scrumTask.Tester eachTester : scrum.testerList ){
            System.out.println(eachTester.name + " : "+ eachTester.salary);
        }

        System.out.println("------------------------------------------------------");

        for (day31_Constructors.scrumTask.Developer eachDeveloper : scrum.developerList) {
            System.out.println(eachDeveloper.name +" : "+ eachDeveloper.salary);
        }

        System.out.println("==========================");

        scrum.removeTester(12);
        scrum.removeDeveloper(42);
        System.out.println(scrum);


    }
}

class Tester{
    public String name, jobTitle;
    public int employeeID;
    public double salary;

    public Tester(String name, String jobTitle, int employeeID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", salary= $" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name+" is smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }

}

class Developer{
    public String name, jobTitle;
    public int employeeID;
    public double salary;

    public Developer(String name, String jobTitle, int employeeID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", salary= $" + salary +
                '}';
    }

    public void coding(){
        System.out.println(name+" is coding");
    }
    public void unitTesting(){
        System.out.println(name+" is unit testing");
    }
    public void fixingBug(){
        System.out.println(name+" is fixing bug");

    }
}

class ScrumTeam{
    public String PO, BA, SM;
    public ArrayList<day31_Constructors.scrumTask.Tester> testerList=new ArrayList<>();
    public ArrayList<day31_Constructors.scrumTask.Developer> developerList=new ArrayList<>();

    public int daysOfSprint;


    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(day31_Constructors.scrumTask.Tester tester){
        testerList.add(tester);
    }
    public void addTesters(day31_Constructors.scrumTask.Tester[] testers){
        testerList.addAll(Arrays.asList(testers));
    }
    public void addDeveloper(day31_Constructors.scrumTask.Developer developer){
        developerList.add(developer);
    }
    public void addDeveloper(day31_Constructors.scrumTask.Developer[] developers){
        developerList.addAll(Arrays.asList(developers));
    }

    public void removeTester(int employeeID){
        testerList.removeIf(p-> p.employeeID ==employeeID);
    }
    public void removeDeveloper(int employeeID){
        developerList.removeIf(p-> p.employeeID==employeeID);
    }



    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testerList.size() +
                ", total number of developers=" + developerList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
