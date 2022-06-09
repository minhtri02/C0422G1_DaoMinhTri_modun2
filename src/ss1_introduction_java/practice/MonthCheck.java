package ss1_introduction_java.practice;

import java.util.Scanner;

public class MonthCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;
        do {
            System.out.println("Nhập số tháng để kiểm tra: ");
            month = scanner.nextInt();
            if (month > 12 || month < 1) {
                System.out.println("Bạn nhập sai tháng, vui lòng nhập lại");
            } else {
                switch (month) {
                    case 2:
                        System.out.println("Tháng 2 có 28 hoặc 29 ngày");
                        break;
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println("Tháng " + month + " có 31 ngày");
                        break;
                    default:
                        System.out.println("Tháng " + month + " có 30 ngày");
                        break;
                }
            }
        } while (month != 50);
    }
}
