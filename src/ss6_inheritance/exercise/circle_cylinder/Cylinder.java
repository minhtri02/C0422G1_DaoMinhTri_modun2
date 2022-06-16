package ss6_inheritance.exercise.circle_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double hight) {
        this.height = hight;
    }

    public Cylinder(double radius, double hight) {
        super(radius);
        this.height = hight;
    }

    public Cylinder(String color, double radius, double hight) {
        super(color, radius);
        this.height = hight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume() {
        return this.getRadius()*this.getRadius()*Math.PI*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "hight=" + height +
                ", " + super.toString() +
                ", volume: "+volume()+
                '}';
    }
}
