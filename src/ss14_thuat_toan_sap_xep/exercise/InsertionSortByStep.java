package ss14_thuat_toan_sap_xep.exercise;

import java.util.Arrays;

public class InsertionSortByStep {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(list));
        System.out.println("ket qua\n"+Arrays.toString(insertionSortByStep(list)));
    }
    public static int[] insertionSortByStep(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j]<arr[j-1]){
                    System.out.println("Swap "+ arr[j-1]+" with "+ arr[j]);
                    int x = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = x;

                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        return arr;
    }
}
