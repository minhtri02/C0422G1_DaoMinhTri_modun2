package ss2_loop_java.bai_tap;

public class PrimeNumberLessThan100 {
    public static boolean kiemTraSoNguyenTo(int n){
        boolean check = false;
        int dem =0;
        if (n>1) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    dem++;
                    break;
                }
            }
            if (dem == 0) {
                check = true;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (kiemTraSoNguyenTo(i)){
                System.out.println(i);
            }
        }
    }
}
