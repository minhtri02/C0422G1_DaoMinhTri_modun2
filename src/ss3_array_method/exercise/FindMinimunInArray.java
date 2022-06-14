package ss3_array_method.exercise;

import java.util.Scanner;

public class FindMinimunInArray {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Nhập số lương trong mảng:");
        int amount = scn.nextInt();
        int[] array = new int[amount];
        for (int i = 0; i < amount; i++) {
            System.out.println("Nhập phần tử thứ " + i + " trong mảng");
            array[i] = scn.nextInt();
        }
        System.out.println("số nhỏ nhất trong mảng là: "+findMiniMun(array));
    }
    public static int findMiniMun(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
