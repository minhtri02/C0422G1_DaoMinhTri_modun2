package ss3_array_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveNumberInArray {
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
        System.out.println("Nhập phần tử cần xoá trong mảng:");
        int a = scn.nextInt();
        System.out.println(Arrays.toString(themVaoMang(a,array)));
    }
    public static int[] themVaoMang(int a,int[] array){
        boolean isExist = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==a) {
                for (int j = i; j < array.length-1 ; j++) {
                    array[j]=array[j+1];
                }
                array[array.length-1]=0;
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy " + a + " trong mảng.");
        }
        return array;
    }
}
