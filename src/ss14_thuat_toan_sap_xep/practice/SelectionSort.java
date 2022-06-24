package ss14_thuat_toan_sap_xep.practice;

import java.util.Arrays;

public class SelectionSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(list));
        System.out.println("Ket qua\n"+Arrays.toString(selectionSort(list)));
    }
    public static int[] selectionSort(int[] arr){
        int min ;
        int index ;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            index=i;
            for (int j = i; j < arr.length; j++) {
                if (min>arr[j]){
                    min=arr[j];
                    index=j;
                }
            }
            arr[index] = arr[i];
            arr[i] = min;
        }
        return arr;
    }
}
