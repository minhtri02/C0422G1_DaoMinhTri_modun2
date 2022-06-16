package ss6_inheritance.exercise.circle_cylinder;

public class Circle {
    private String color ="black" ;
    private double radius =5.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                ", Arae: "+ getArea()+
                '}';
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
}
