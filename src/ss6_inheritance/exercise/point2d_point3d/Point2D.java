package ss6_inheritance.exercise.point2d_point3d;

public class Point2D {
    protected float x ;
    protected float y ;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y ){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float[] arr = {this.x,this.y};
        return arr;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "("+x+","+y+")"+
                '}';
    }
}
