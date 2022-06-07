package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class PhuongtrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Phương trình bậc Nhất có dạng ax+b=c :");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a:");
        double a = scanner.nextDouble();
        System.out.print("Nhập b:");
        double b = scanner.nextDouble();
        System.out.print("Nhập c:");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.println("phương trình có 1 nghiệm:" + answer);
        } else if (b == c) {
            System.out.println("Phương trình có vô số nghiệm!");

        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
