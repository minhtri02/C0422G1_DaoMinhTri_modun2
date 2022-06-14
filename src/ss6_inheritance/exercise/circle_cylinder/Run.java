package ss6_inheritance.exercise.circle_cylinder;

public class Run {
    public static void main(String[] args) {
        Circle tron = new Circle("red",2.0);
        Cylinder truTron = new Cylinder(2.0);
        Circle trutron2 = new Cylinder(4.0);
        System.out.println(((Cylinder)trutron2).volume());
        System.out.println(tron);
        System.out.println(truTron);
        System.out.println(trutron2);
        System.out.println(truTron.volume());
        System.out.println(truTron.Arae());
        System.out.println(trutron2.Arae());
        System.out.println(trutron2);

    }
}
