package ss6_inheritance.exercise.circle_cylinder;

public class Cylinder extends Circle {
    private double hight;

    public Cylinder() {
    }

    public Cylinder(double hight) {
        this.hight = hight;
    }

    public Cylinder(double radius, double hight) {
        super(radius);
        this.hight = hight;
    }

    public Cylinder(String color, double radius, double hight) {
        super(color, radius);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double volume() {
        return this.getRadius()*this.getRadius()*Math.PI*this.hight;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "hight=" + hight +
                ", " + super.toString() +
                ", volume: "+volume()+
                '}';
    }
}
