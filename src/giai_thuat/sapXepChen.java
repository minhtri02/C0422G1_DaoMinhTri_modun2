package giai_thuat;

import java.util.Arrays;
import java.util.Queue;

public class sapXepChen {
    public static void main(String[] args) {
        int[] arr = {-1, 150, 190, 170, -1, -1, 160, 180};
//        int m = 0;
//        int d;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                int m = arr[i],d = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] != -1) {
                        if (arr[j] < m) {
                            m = arr[j];
                            d = j;
                        }
                    }
                }
                arr[d] = arr[i];
                arr[i] = m;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
