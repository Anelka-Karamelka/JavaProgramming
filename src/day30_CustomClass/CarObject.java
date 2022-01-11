package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {
    public static void main(String[] args) {

        Car car1 =new Car();
        car1.setInfo("Toyota", "Camry", "White", 2020, 35000.5 );


        Car car2=new Car();
        car2.setInfo("Lexus", "RX330", "Red", 2018, 40350.60);

        Car car3=new Car();
        car3.setInfo("Mersedec", "Benz", "Black", 2021, 100000.1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);


       // Car[] cars={ car1, car2, car3};
        ArrayList<Car>carList =new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2,car3));


        for (Car each:carList){
            System.out.println(each.brand +" : "+each.price);
        }

        System.out.println("====================");

        /*
         Recall:
            BMW: 2005 ~ 2008
            Toyota: 1995 ~ 1997
         */

        carList.removeIf( p -> p.brand.equals("BMW") && p.year >= 2005 && p.year <= 2008 );
        carList.removeIf( p -> p.brand.equals("Toyota") && p.year >= 1995 && p.year <= 1997);








        car1.drive();
        car2.start();
        car3.start();
    }
}
