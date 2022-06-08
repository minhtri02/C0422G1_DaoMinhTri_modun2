import java.util.Scanner;

public class GiaiThuat {
    public static void main(String[] args) {
        int num;
        System.out.print("Số dòng: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        for (int r = 1; r <= num; r++) {
            for (int sp = num - r; sp > 0; sp--) {
                System.out.print(" ");
            }
            for (int c = 1; c <= r; c++) {
                if (c==r){
                    System.out.print(r);
                }else {System.out.print(" ");}

            }
            for (int k = 2; k <= r; k++) {
                if (k==r){
                    System.out.print(r);
                }else {System.out.print(" ");}
            }
            System.out.println();
        }

    }
}
