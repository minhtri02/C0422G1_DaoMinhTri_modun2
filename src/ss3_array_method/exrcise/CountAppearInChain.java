package ss3_array_method.exrcise;

import java.util.Scanner;

public class CountAppearInChain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập chuỗi từ bàn phím:");
        String str = scn.nextLine();
        System.out.println(str);
        System.out.println("Nhập 1 ký tự cần tìm:");
        char charater = scn.nextLine().charAt(0);
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==charater){
                count++;
            }
        }
        System.out.println("có "+count+" ký tự "+charater+" trong chuỗi");
    }
}
