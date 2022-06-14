package ss3_array_method.exercise;

import java.util.Scanner;

public class SumDiagonalArray2D {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Nhập số lượng trong mảng 2D:");
        int amount = scn.nextInt();
        int[][] array = new int[amount][amount];
        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < amount; j++) {
                System.out.println("Nhập phần tử "+i+","+j);
                array[i][j] = scn.nextInt();
            }
        }
        System.out.println("Tổng đường chép của array2D : "+sumDiagonal(array));
    }
    public static int sumDiagonal(int [][] array){
        int sum =0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == array.length-1){
                    System.out.println(array[i][j]);
                }else {
                    System.out.print(array[i][j]+",");
                }
                if (i==j){
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
}
