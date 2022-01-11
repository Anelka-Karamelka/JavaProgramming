package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
        oddOrEven(6); // the methods demand additional information to complete this task

        ageOFPerson(1995);
    }


    //create a function that ca check number is odd number or even number
    public static void oddOrEven(int number){

        if(number%2==0){
            System.out.println(number +" is even number");
        }else{
            System.out.println(number +" is odd number");
        }
    }

    // create a function that can display age of person
    public  static void ageOFPerson (int birthYear){

        int age =2021 - birthYear;
        System.out.println("Your age is " + age);
    }


    // create a function that can print all numbers betwwen X and Y

    public static void printNumbers(int x, int y){

    }
}
