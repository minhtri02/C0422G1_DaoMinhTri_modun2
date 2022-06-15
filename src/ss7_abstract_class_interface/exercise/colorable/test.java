package ss7_abstract_class_interface.exercise.colorable;

import ss7_abstract_class_interface.exercise.resizeable.Circle;
import ss7_abstract_class_interface.exercise.resizeable.Rectangle;
import ss7_abstract_class_interface.exercise.resizeable.Shape;

public class test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        Circle circle = new Circle(5);
        Circle circle1 = new Circle(6);
        Square square = new Square(5);
        Square square1 = new Square(8);


        shapes[0] = circle;
        shapes[1] = square;
        shapes[2] = square1;
        shapes[3] = circle1;

        for (Shape s : shapes) {
            System.out.println(s.getArea());
        }

        for (Shape s : shapes) {
            if (s instanceof Square){
                ((Square) s).howToColor();
            }
            System.out.println(s.getArea());
        }
    }
}
