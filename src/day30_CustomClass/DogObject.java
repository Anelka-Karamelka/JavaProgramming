package day30_CustomClass;

import java.util.ArrayList;

public class DogObject {

    public static void main(String[] args) {

      Dog dog1=new Dog();

      dog1.name="Lucy";
      dog1.breed="Husky";
      dog1.age=5;
      dog1.gender= 'F';
      dog1.size="Small";
      dog1.color="White";

        Dog dog2=new Dog();
        dog2.name="Teddy";
        dog2.breed="labrador";
        dog2.age=2;
        dog2.gender= 'M';
        dog2.size="Large";
        dog2.color="Brown";

        Dog dog3=new Dog();
        dog3.setInfo("Jack","German Shepard",2, 'M', "Large","Black");



        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();

        dog2.bark();

        Dog dog4= new Dog();
        dog4.setInfo("Bullet", " Golden Retriver", 3, 'M', "Extra LArge", "Yellow");

        Dog dog5= new Dog();
        dog5.setInfo("Sully", "Pit-Bull", 6, 'M', "Large", "black");


      Dog[]dogs={dog1, dog2, dog3, dog4, dog5};

      ArrayList<Dog> femaleDogs=new ArrayList<>();



      ArrayList<Dog> maleDogs=new ArrayList<>();

    }
}
