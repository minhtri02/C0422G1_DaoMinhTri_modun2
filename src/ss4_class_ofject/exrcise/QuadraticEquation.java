package ss4_class_ofject.exrcise;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public boolean checkDiscriminant() {
        return getDiscriminant() > 0;
    }

    public double getRoot1() {
        return (-this.b + Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập a:");
        double a = scn.nextDouble();
        System.out.println("Nhập b:");
        double b = scn.nextDouble();
        System.out.println("Nhập c:");
        double c = scn.nextDouble();
        QuadraticEquation bac2 = new QuadraticEquation(a, b, c);
        if (bac2.checkDiscriminant()){
            System.out.println("Phương trình có 2 nghiệm");
            System.out.println("x1 = "+bac2.getRoot1());
            System.out.println("x2 = "+bac2.getRoot2());
        }else if (bac2.getDiscriminant()==0){
            System.out.print("Phương trình có 1 nghiệm kép: "+bac2.getRoot1());
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
        System.out.println(bac2.toString());
    }
}
