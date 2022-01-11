package day24_CustomMethods_Return;

public class BreakfastTask {
    public static void main(String[] args) {

     initials("cydeo", "school");

        System.out.println("----------email--------");

        domain("Cydeo.School@gmail.com");

        String [] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};

        for (String each : emails) {
            domain(each);
        }
            nameOfMonth(5);

            nameOfDay(7);

            }



   // 1. Create a method that can display the initials of the person. String firstNAme, String lastName

    public static void initials(String firstName, String lastName){

        String initial = firstName.charAt(0)+"."+lastName.charAt(0);
        initial=initial.toUpperCase();
        System.out.println("initial = " + initial);

    }

 //   2. Create a method that can display the domain of the email. domain(email)

    public static void domain(String email){ // Cydeo@mail.com

        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }

//Create a method that can display the name of the month based on the given number to the method

   public static void nameOfMonth(int number){

       String name = "";

       if(number>=1 && number<=12) { //12
          name = (number==1)? "Jan" :(number==2)? "Feb" :(number==3)? "Mar"
       :(number==4)? "Apr" :(number==5)? "May" :(number==6)? "June" :(number==7)? "July" :(number==8)?
                  "Aug" :(number==9)? "Sep" :(number==10)? "Oct" :(number==11)? "Nov":"Dec";

       }else{
           name = "Invalid";
       }
       System.out.println("Month name = " + name);
   }

   // Create a method that can print the name of the day based on the given number to the method

    public static void nameOfDay (int number){

        String day ="";
        if(number>=1 && number<=7){

            day = (number==1)? "Monday" :(number==2)? "Tuesday" :(number==3)? "Wednesday" :(number==4)?
                    "Thursday" :(number==5)? "Friday" :(number==6)? "Saturday" :"Sunday";

        }else{
            day="Invalid day";
        }


    }

    //Create a method that can print how many days a month has

    public static void daysInMonth(int number, int year) {

        String result = "";

        if (number >= 1 && number <= 12) {
            switch (number) {
                case 2:
                    result = (year % 4 == 0) ? "29 days": "28 days";
                    break;
                case 4: case 6: case 9: case 11:
                    result = "30 days";
                    break;
            }

        }

    }}
/*





 */