package ss7_abstract_class_interface.exercise.resizeable;

//import ss6_inheritance.practice.Shape;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Circle circle = new Circle(3.0);
        Rectangle rectangle = new Rectangle(3,3);
        Square square = new Square(4);
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = square;
        for (Shape s : shapes) {

            System.out.println(s.getArea());
        }
//        System.out.println(Arrays.toString(shapes));

        for (Shape s : shapes) {
            s.resize(Math.floor(Math.random()*100+1)/100);
            System.out.println(s.getArea());
        }


    }
}
