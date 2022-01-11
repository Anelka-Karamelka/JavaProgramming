package day04_Variables;

public class Square {

    public static void main(String[] args) {

        // DataType variable name = data;
        
       double side = 7.5;  // double as 7.5; 5.5; 3.5
       double area = side * side;

       double perimeter = side * 4;

        System.out.println("side = " + side);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }

}

/* create a class named square. write a program that can calculate the area,
perimeter of any given square side
side (3.5)

                        area = side * side;
                        perimeter = 4 * side
 */