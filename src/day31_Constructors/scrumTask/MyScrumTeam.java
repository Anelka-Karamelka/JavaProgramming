package day31_Constructors.scrumTask;

public class MyScrumTeam {


    public static void main(String[] args) {


        //4 testers objects

        Tester tester1=new Tester("Anelya","SDET", 05, 200000);
        Tester tester2=new Tester("Sandra","QA", 12, 150000);
        Tester tester3=new Tester("Ali","SE", 42, 142000);
        Tester tester4=new Tester("Aisha","SDET", 17, 115000);

        Tester[] testers={tester2,tester3,tester4};

        // 4 developers objects
        Developer developer1=new Developer("Olga", "Java Developer", 22, 125000);
        Developer developer2=new Developer("Aygun", "Java Master", 29, 150000);
        Developer developer3=new Developer("Tunc", "Software Developer", 42, 145000);
        Developer developer4=new Developer("Sinem", "Senior Developer", 62, 120000);

        Developer[] developers={developer2,developer3,developer4};


        // 1 Scrumteam object

        ScrumTeam scrum=new ScrumTeam("Nigara", "Hussein", "Neira", 14);

        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);


        scrum.addTesters(testers);
        scrum.addDeveloper(developers);
        System.out.println(scrum);


        System.out.println("============================");
        for(Tester eachTester : scrum.testerList ){
            System.out.println(eachTester.name + " : "+ eachTester.salary);
        }

        System.out.println("------------------------------------------------------");

        for (Developer eachDeveloper : scrum.developerList) {
            System.out.println(eachDeveloper.name +" : "+ eachDeveloper.salary);
        }

        System.out.println("==========================");

        scrum.removeTester(12);
        scrum.removeDeveloper(42);
        System.out.println(scrum);


    }
}
