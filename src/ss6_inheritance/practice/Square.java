package ss6_inheritance.practice;

public class Square extends Rectangle {
    public Square(double size) {
        super(size,size);
    }

    public Square() {
    }

    public Square(String color, boolean filler, double size) {
        super(color, filler, size, size);
    }

    public double getsize (){
        return getWidth();
    }

    public void setSize(double size){
        setWidth(size);
        setLenght(size);
    }

    @Override
    public void setWidth(double width) {
        setSize(width);
    }

    @Override
    public void setLenght(double lenght) {
        setSize(lenght);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getsize()
                + ", which is a subclass of "
                + super.toString();
    }
}
