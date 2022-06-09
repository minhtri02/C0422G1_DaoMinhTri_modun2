package ss2_loop_java.practice;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        System.out.println("Nhập vào 1 số nguyên n:");
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        int dem =0;
        if (n>1) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    dem++;
                    break;
                }
            }
            if (dem == 0) {
                System.out.printf("%d là số nguyên tố", n);
            } else System.out.printf("%d không phải là số nguyên tố", n);
        }else System.out.printf("%d không phải là số nguyên tố",n);
    }
}
