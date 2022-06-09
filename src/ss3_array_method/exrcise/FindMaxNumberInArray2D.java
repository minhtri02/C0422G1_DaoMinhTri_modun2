package ss3_array_method.exrcise;

import java.util.Scanner;

public class FindMaxNumberInArray2D {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Nhập row trong mảng 2D:");
        int row = scn.nextInt();
        System.out.println("Nhập col trong mảng 2D:");
        int col = scn.nextInt();
        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập phần tử "+i+","+j);
                array[i][j] = scn.nextInt();
            }
        }
        System.out.println("Giá trị lớp nhất trong mảng là: "+findMaxMun(array));
    }
    public static int findMaxMun(int [][] array){
        Scanner scn= new Scanner(System.in);
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]>max){
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
