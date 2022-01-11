package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Anel";
        String lastName = "Adilbayeva";
        int age = 45;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;

        //full name of person is
        System.out.println("Full name of the person is " + fullName);

        // --- is -- years old
        System.out.println(fullName + " is " + 45 + " years old" );

        //FullName is JobTitle +, works at companyName
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName
                + ", and "+fullName + "'s salary is $" + salary);


    }
}
