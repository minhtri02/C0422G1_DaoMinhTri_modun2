package ss2_vong_lap_java.thuc_hanh;

import java.util.Scanner;

public class UocSoLonNhat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a ,b;
        System.out.println("Nhập số a:");
        a = Integer.parseInt(scn.nextLine());
        System.out.println("Nhập số b:");
        b = Integer.parseInt(scn.nextLine());
        while (a!=b){
            if (a>b){
                a=a-b;
            }else {
                b =b-a;
            }
        }
        System.out.println("Ước chung lớn nhất là: "+a);
//        System.out.println(b);
    }
}
