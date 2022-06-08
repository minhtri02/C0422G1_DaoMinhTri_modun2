package ss2_loop_java.bai_tap;

import java.util.Scanner;

public class DisplayTypes {
    public static String rectangle() {
        String str = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                str += "*";
            }
            str += "\n";
        }
        return str;
    }

    public static String triangle() {
        String str = "";
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <= i; j++) {
                str += "*";
            }
            str += "\n";
        }
        return str;
    }

    public static String rightTriangleTop() {
        String str = "";
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                str += "*";
            }
            str += "\n";
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String menu;
        int a;
        boolean tmv =true;
        do {
            menu = " 1. In hình chữ nhật" +
                    "\n 2.In hình tam giác vuông" +
                    "\n 3.In tam giác isosceles" +
                    "\n 4.Thoát";
            System.out.println(menu);
            a = scn.nextInt();
            switch (a) {
                case 1:
                    System.out.println(rectangle());
                    break;
                case 2:
                    System.out.println(triangle());
                    break;
                case 3:
                    System.out.println(rightTriangleTop());
                    break;
                default:
                    tmv = false;
            }
        } while (tmv);

    }
}
