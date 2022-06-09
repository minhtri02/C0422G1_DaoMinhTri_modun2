package ss3_array_method.practice;

import java.util.Arrays;
import java.util.Scanner;

public class DaoMang {
    public static int[] daomang( int[]array){
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[array.length - 1 - j];
            array[array.length - 1 - j] = temp;
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập số lượng phần từ trong mảng: ");
        int size = scn.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ "+i);
            array[i]= scn.nextInt();
        }
        System.out.println(Arrays.toString(array));
        daomang(array);
        System.out.println(Arrays.toString(array));
    }
}
