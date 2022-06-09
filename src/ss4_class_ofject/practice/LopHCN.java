package ss4_class_ofject.practice;

import java.util.Scanner;

public class LopHCN {
double width,height;

    public LopHCN(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }

    @Override
    public String toString() {
        return "LopHCN{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập chiều rộng của HCN:");
        double rong = scn.nextDouble();
        System.out.println("Nhập chiều dài của HCN:");
        double dai = scn.nextDouble();
        LopHCN hcn = new LopHCN(rong,dai);
        System.out.println("diện tích: "+hcn.getArea());
        System.out.println("chu vi:"+hcn.getPerimeter());
        System.out.println(hcn.toString());

    }
}
