package ss6_inheritance.exercise.circle_cylinder;

public class Run {
    public static void main(String[] args) {
        Circle circle = new Circle("red",2.0);
        Cylinder cylinder = new Cylinder(2.0);
        Circle cylinder1 = new Cylinder(4.0);
        System.out.println(((Cylinder)cylinder1).volume());
        System.out.println(circle);
        System.out.println(cylinder);
        System.out.println(cylinder1);
        System.out.println(cylinder.volume());
        System.out.println(cylinder.Arae());
        System.out.println(cylinder1.Arae());
        System.out.println(cylinder1);

    }
}
