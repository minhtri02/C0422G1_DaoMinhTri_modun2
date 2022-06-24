package ss15_xu_ly_ngoai_le_debug.exercise;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) throws IllegalTriangleException{
        if (a == 0 || b == 0 || c == 0) {
            throw new IllegalTriangleException("Cạnh tam giác sai rồi");
        } else if ((a + b) <= c || ((a + c) <= b) || (c + b) <= a) {
            throw new IllegalTriangleException("không phải hình tam giác");
        }else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
