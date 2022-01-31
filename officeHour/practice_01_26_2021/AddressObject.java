package practice_01_26_2021;

public class AddressObject {

    public static void main(String[] args) {

        Address home=new Address();
        home.setStreet("1723 St North");
        home.setCity("Chicago");
        home.setState("IL");
        home.setZipCode("54786");
        System.out.println("Home address:"+ home);


        home.setZipCode("5645454");
        home.setStreet("");

    }
}
