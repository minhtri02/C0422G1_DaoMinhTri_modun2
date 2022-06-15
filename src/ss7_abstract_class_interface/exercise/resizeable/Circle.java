package ss7_abstract_class_interface.exercise.resizeable;

//import ss6_inheritance.practice.Shape;

public class Circle extends Shape implements Resizeable{
    double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filler, double radius) {
        super(color, filler);
        this.radius = radius;
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "A Circle with radius="+radius+", which is a subclass of "+super.toString();
    }

    @Override
    public void resize(double percent) {
        setRadius(this.getRadius()*(1+(percent/100)));
    }
}
