package ss3_array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddToArray {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Nhập số lương trong mảng:");
        int amount = scn.nextInt();
        int[] array = new int[amount];
        for (int i = 0; i < amount; i++) {
            System.out.println("Nhập phần tử thứ " + i + " trong mảng");
            array[i] = scn.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập số cần chèn vào mảng:");
        int number = scn.nextInt();
        System.out.println("Nhập vị trí cần chèn:");
        int viTri = scn.nextInt();
        System.out.println(Arrays.toString(addToArray(number,viTri,array)));
    }
    public static int [] addToArray(int number,int vitri,int[]array){
        int [] array1 =new int[array.length+1];
        if (vitri >= 0) System.arraycopy(array, 0, array1, 0, vitri);
        array1[vitri]=number;
        if (array.length - vitri >= 0) System.arraycopy(array, vitri, array1, vitri + 1, array.length - vitri);
        return array1;
    }
}
