package ss2_loop_java.bai_tap;

import java.util.Scanner;

public class FirstPrimeNumber {
    public static boolean kiemTraSoNguyenTo(int n) {
        boolean check = false;
        int dem = 0;
        if (n > 1) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    dem++;
                    break;
                }
            }
            if (dem == 0) {
                check = true;
            }
        }
        return check;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int soLuong;
        int count;
        int songuyento;
        count = 1;
        songuyento = 2;
        int chon;
        do {
            System.out.println("Nhập số lượng số nguyên tố");
            soLuong = scn.nextInt();
            while (count <= soLuong){
                if (kiemTraSoNguyenTo(songuyento)) {
                    System.out.println(count + ". " + songuyento);
                    count++;
                }
                songuyento++;
            }
            System.out.println("Bạn có muốn tiếp tục?\n 1.YES  2.NO");
            chon = scn.nextInt();
        } while (chon!=2);
    }
}
