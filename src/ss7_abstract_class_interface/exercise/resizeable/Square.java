package ss7_abstract_class_interface.exercise.resizeable;

//import ss6_inheritance.practice.Rectangle;

public class Square extends Rectangle implements Resizeable{
//    private double size;

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
    public String toString() {
        return "A Square with side="
                + getsize()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.setSize(this.getsize()*(1+percent/100));
    }
}
