package ss6_inheritance.exercise.point_moveable_point;

public class Run {
    public static void main(String[] args) {
        Point diem = new Point(1,3);
        MovablePoint move = new MovablePoint(1,3,4,3);
        System.out.println(diem);
        System.out.println(move.move());
    }
}
