package day43_Abstraction.car;

public class CarShow {


    public static void main(String[] args) {

//        Car car1=new Car("Cydeo", "25", "Blue", 2022, 100000); {
  // we can't create an object from Abstract class, bc abstract class is not concrete


        Honda honda=new Honda("Accord", "Black", 2019, 30000);

        Audi audi=new Audi("Q7", "Blue", 2020, 50000);

        Tesla tesla=new Tesla("Model3", "White", 2021, 60000);


        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

    }
}
