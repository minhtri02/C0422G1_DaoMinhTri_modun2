package ss2_vong_lap_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static String hcn(){
        String str="";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                str += "*";
            }
            str+= "\n";
        }
        return str;
    }
    public static String tamGiac(){
        String str="";
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <= i; j++) {
                str += "*";
            }
            str+= "\n";
        }
        return str;
    }
    public static String tamGiacVuongTop(){
        String str="";
        for (int i = 7; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                str += "*";
            }
            str+= "\n";
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String menu;
        int a;
        do {
            menu = " 1. In hình chữ nhật" +
                    "\n 2.In hình tam giác vuông" +
                    "\n 3.In tam giác isosceles" +
                    "\n 4.Thoát";
            System.out.println(menu);
            a  = scn.nextInt();
            switch (a){
                case 1:
                    System.out.println(hcn());
                    break;
                case 2:
                    System.out.println(tamGiac());
                    break;
                case 3:
                    System.out.println(tamGiacVuongTop());
                    break;
                default:
                    System.exit(0);
            }
        }while (a!=4);

    }
}
