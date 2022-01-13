package practice_01_12_2022.constructor;

public class BaklavaObjects {

    public static void main(String[] args) {

        BaklavaRecipe b1=new BaklavaRecipe("pistachio");
        b1.price=40.50;
        b1.amountLB=2;
        System.out.println(b1);

        BaklavaRecipe b2=new BaklavaRecipe("wallnut", 3, 50.70);
        System.out.println(b2);

        b1.feedback();
        b1.order();

    }
}
