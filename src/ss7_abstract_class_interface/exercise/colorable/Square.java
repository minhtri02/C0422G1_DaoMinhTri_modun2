package ss7_abstract_class_interface.exercise.colorable;

//import ss6_inheritance.practice.Rectangle;

import ss7_abstract_class_interface.exercise.resizeable.Rectangle;

public class Square extends Rectangle implements Colorable {
    public Square(double size) {
        super(size,size);
    }

    public Square() {
    }

    public Square(String color, boolean filler, double size) {
        super(color, filler, size, size);
    }

    public double getsize (){
        return getWidth();
    }

    public void setSize(double size){
        setWidth(size);
        setLenght(size);
    }

    public double getAria(){
        return this.getsize()*this.getsize();
    }

    @Override
    public void setWidth(double width) {
        setSize(width);
    }

    @Override
    public void setLenght(double lenght) {
        setSize(lenght);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getsize()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.print("Color all four sides: s =");
    }
}
