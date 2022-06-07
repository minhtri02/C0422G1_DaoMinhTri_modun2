package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhập số năm cần kiểm tra");
        year = scanner.nextInt();
        boolean Dem = false;
        if (year%4==0){
            if (year%100==0){
                if (year%400 ==0){
                    Dem =true;
                }
            }else {
                Dem =true;
            }
        }
        if (Dem) System.out.printf("%d Là năm nhuận", year);
        else System.out.printf("%d không phải là năm nhuận",year);
    }
}
