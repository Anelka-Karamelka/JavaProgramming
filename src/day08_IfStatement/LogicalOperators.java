package day08_IfStatement;

public class LogicalOperators {

    public static void main(String[] args) {
        String name = "Steven";
        int age = 19;
        String citizen = "USA";

        boolean isEligible = age >=18 && citizen == "USA";
        //                   19 >=18 && "UK" == "USA
        //                   true &&" true ==> true
        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("---------------");

        String name2 = "Josh";

        int creditScore = 720;
        int age2 = 23;
        int income = 40000;

        boolean isEligible2 = creditScore >=700 && age2 >=21 && income >= 60000;
        System.out.println(name2 +" is eligible for loan: " +isEligible2);

        System.out.println("---------");

        String name3 = "Shay";

        int age3 = 21;
        char gender = 'F';
        boolean isEligible3 = age3 >=18 && (gender == 'M' || gender == 'F');
                         //   21 >= 18 && ( 'F' == 'M' || "F" == 'F'
                         // true    && ( false         || true
                         // true && true
                         // true
        System.out.println(name3+" is eligible to register: " + isEligible3);

        System.out.println("---------");

        String name4 = "James";

        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = false;

        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;
                              // false                 || false
        System.out.println(name4 +" is eligible to apply for US citizenShip: " + isEligible4);

        System.out.println("------------");

        String student = "Anna";
        double gpa = 3.5;
        int familyIncome = 100000;

        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;






    }
}
