package ss6_inheritance.exercise.point2d_point3d;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y , float z){
        this.z =z;
        super.x =x;
        super.y =y;
    }
    public float[] getXYZ(){
        float[] arr = {this.x,this.y,this.z};
                return arr;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "(" + x +", "+ y+", "+z+")"+
                '}';
    }
}
