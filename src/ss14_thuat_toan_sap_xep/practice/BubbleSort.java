package ss14_thuat_toan_sap_xep.practice;

import java.util.Arrays;

public class BubbleSort{
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(list)));
    }
    public static int[] bubbleSort(int[] arr){
        int x;
        boolean flag=true;
        for (int i = 0; i < arr.length-1 && flag; i++) {
            for (int j = arr.length-1; j > i ; j--) {
                if(arr[j]<arr[j-1]){
                    x = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=x;
                    flag=false;
                }
            }
        }
        return arr;
    }
}
