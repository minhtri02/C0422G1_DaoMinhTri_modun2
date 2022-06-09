package ss4_class_ofject.exrcise;

import java.util.Date;
//import java.util.Time;
import java.util.Timer;

public class StopWatch {
    private static int sum() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
    private static void doJob(int count) {
        // Gọi phương thức 'sum' với số lần cho bởi tham số.
        for (int i = 0; i < count; i++) {
            sum();
        }
    }
    public static void main(String[] args) {
        long millis1 = System.currentTimeMillis();

        doJob(10000);

        long millis2 = System.currentTimeMillis();

        long distance = millis2 - millis1;

        System.out.println("Distance time in milli second: " + distance);
    }
}
