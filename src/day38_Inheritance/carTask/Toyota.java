package day38_Inheritance.carTask;

public class Toyota extends Car {
    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand+""+""+" is reliable");
    }
}

/*
  Create the following sub classes of Car:
        1. Toyota:
                extra methods:
                    reliable()

 */