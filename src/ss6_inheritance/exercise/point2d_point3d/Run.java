package ss6_inheritance.exercise.point2d_point3d;

public class Run {
    public static void main(String[] args) {
        Point2D diem2d = new Point2D(1,2);
        Point2D diem23d = new Point2D();
        Point3D diem3d = new Point3D(1,2,3);
        Point2D diem3d1 = new Point3D(1,2,3);
        System.out.println(diem2d);
        System.out.println(diem23d);
        System.out.println(diem3d);
        System.out.println(diem3d1);
    }
}
