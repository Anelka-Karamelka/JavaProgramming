package day45_Abstraction_Interface.shape;

import day45_Abstraction_Interface.shape.Shape;

public class Square extends Shape {

    private double side;

    public Square(String name, double side) {
        super("Square");
         setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new RuntimeException("invalid side" + side);
        }
        this.side = side;
        }


    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }


    @Override
    public String toString() {
        return "Square{" +
                super.toString()+
                "side=" + side +
                '}';
    }
}



