package ss3_array_method.practice;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static double fSangc(double a) {
        double result = (5.0 / 9) * (a - 32);
        return result;
    }

    public static double cSangf(double a) {
        double result = (9.0 / 5) * a + 32;
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int choose;
        do {
            System.out.println("1. Fahrenheit to Celsius\n" +
                    "\n" +
                    "2. Celsius to Fahrenheit\n" +
                    "\n" +
                    "0. Exit ");
            choose = scn.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Nhập độ F để đổi sang độ C:");
                    double doF = scn.nextDouble();
                    System.out.println("Result= " + fSangc(doF));
                    break;
                case 2:
                    System.out.println("Nhập độ C để đổi sang độ F:");
                    double doC = scn.nextDouble();
                    System.out.println("Result= " + cSangf(doC));
                    break;
                default:
                    System.exit(0);
            }
        } while (choose != 0);
    }
}
