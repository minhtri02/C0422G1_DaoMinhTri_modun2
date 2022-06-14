package ss4_class_ofject.exercise;

import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch() {
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public StopWatch(Date startTime, Date endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void star() {
        this.startTime = new Date();

    }

    public void stop() {
        this.endTime = new Date();
    }

    public long getElapsedTime() {
//       long start = startTime.getTime();
        return endTime.getTime() - startTime.getTime();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StopWatch watch1 = new StopWatch();

        int n;
        do {
            System.out.println("nhập n: ");
            n = scn.nextInt();
            switch (n){
                case 1:
                    System.out.println("bắt đầu đếm!");
                    watch1.star();
                    System.out.println(watch1.getStartTime());
                    break;
                case 2:
                    System.out.println("kết thúc!");
                    watch1.stop();
                    System.out.println(watch1.getEndTime());
                    System.out.println(watch1.getElapsedTime());
                    break;
                default:
                    System.out.println(watch1.getElapsedTime());
            }
        }while (n!=2);
    }
}
