package ss6_inheritance.exercise.point_moveable_point;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr = {xSpeed, ySpeed};
        return arr;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "(" + super.getX() + ", " + super.getY() + ")" + ", Speed:( "
                + xSpeed + ", " + ySpeed + ")" +
                '}';
    }

    public MovablePoint move() {
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + xSpeed);
        return this;
    }
}
