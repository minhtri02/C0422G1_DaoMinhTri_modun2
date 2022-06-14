package ss6_inheritance.practice;

public class Rectangle extends Shape {
    double width;
    double lenght;

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(String color, boolean filler, double width, double lenght) {
        super(color, filler);
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getArea(){
        return this.lenght*this.width;
    }
    public double getPerimeter(){
        return (this.lenght+this.width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "A Rectangle with width="+width+" and length="+lenght+", which is a subclass of "+super.toString();
    }
}
