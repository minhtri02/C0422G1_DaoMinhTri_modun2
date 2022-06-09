package ss3_array_method.exrcise;

import java.util.Scanner;

public class SumColumInArray2D {
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
        System.out.println("Nhập col cần tính tổng:");
        int Colum = scn.nextInt();
        System.out.println("Tổng của cột "+(Colum)+" là: "+sumColum(Colum,array));
    }
    public static int sumColum(int col, int[][] array){
        int sum =0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == array.length-1){
                    System.out.println(array[i][j]);
                }else {
                    System.out.print(array[i][j]+",");
                }
                if (j==col){
                    sum+=array[i][j];
                }
            }
        }
        return sum;
    }

}
