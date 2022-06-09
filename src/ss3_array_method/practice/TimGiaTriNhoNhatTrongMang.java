package ss3_array_method.practice;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập số lương trong mảng:");
        int soLuong = scn.nextInt();
        int[] array = new int[soLuong];
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập phần tử thứ " + i + " trong mảng");
            array[i] = scn.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Phần tử nhỏ nhất nằm tại vị trí thứ " + timNhoNhat(array) + " trong mảng");
    }

    public static int timNhoNhat(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
