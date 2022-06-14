package ss3_array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập số lương trong mảng:");
        int soLuong1 = scn.nextInt();
        int[] array1 = taoMang(soLuong1);
        System.out.println(Arrays.toString(array1));
        System.out.println("Nhập số lương trong mảng:");
        int soLuong2 = scn.nextInt();
        int[] array2 = taoMang(soLuong2);
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(gopMang(array1, array2)));
    }

    public static int[] taoMang(int soluong) {
        Scanner scn = new Scanner(System.in);
        int[] array = new int[soluong];
        for (int i = 0; i < soluong; i++) {
            System.out.println("Nhập phần tử thứ " + i + " trong mảng");
            array[i] = scn.nextInt();
        }
        return array;
    }

    public static int[] gopMang(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, array3, 0, array1.length);

        System.arraycopy(array2, 0, array3, array1.length, array2.length);
        return array3;
    }
}
