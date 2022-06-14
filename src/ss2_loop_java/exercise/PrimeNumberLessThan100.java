package ss2_loop_java.exercise;

public class PrimeNumberLessThan100 {
    public static boolean primeNumberCheck(int n){
        boolean check = false;
        int count =0;
        if (n>1) {
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
        for (int i = 2; i < 100; i++) {
            if (primeNumberCheck(i)){
                System.out.println(i);
            }
        }
    }
}
