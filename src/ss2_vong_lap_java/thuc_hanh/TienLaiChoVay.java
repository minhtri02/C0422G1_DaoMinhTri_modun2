package ss2_vong_lap_java.thuc_hanh;

import java.util.Scanner;

public class TienLaiChoVay {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập số tiền vay:");
        double money = scn.nextDouble();
        System.out.println("Nhập số tháng vay:");
        int month = scn.nextInt();
        System.out.println("Nhập phần trăm lãi xuất 1 năm");
        double lai = scn.nextDouble();
        double laixuatthang = 0;
        double sum =0;
        for (int i = 0; i < month; i++) {
            laixuatthang = money * (lai / 100) / 12 ;
            money+=laixuatthang;
            sum +=laixuatthang;
        }
        System.out.println(sum);
    }
}
