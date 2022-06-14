package ss2_loop_java.exercise;

import java.util.Scanner;

public class FirstPrimeNumber {
    static void check(){

//        return "txxt";
    }
    public static boolean primeNumberCheck(int n) {
        boolean check = false;
        int count = 0;
        if (n > 1) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                check = true;
            }
        }
        return check;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int amount;
        int count;
        int primeNumber;
        count = 1;
        primeNumber = 2;
        int choose;
        do {
            System.out.println("Nhập số lượng số nguyên tố");
            amount = scn.nextInt();
            while (count <= amount){
                if (primeNumberCheck(primeNumber)) {
                    System.out.println(count + ". " + primeNumber);
                    count++;
                }
                primeNumber++;
            }
            System.out.println("Bạn có muốn tiếp tục?\n 1.YES  2.NO");
            choose = scn.nextInt();
        } while (choose!=2);
    }
}
