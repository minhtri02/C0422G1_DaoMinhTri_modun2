package ss1_introduction_java.bai_tap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ChuyenDoiTien {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#0,000");
        System.out.println("Nhập số tiền USD:");
        double usd = Double.parseDouble(scanner.nextLine());
        System.out.println("Tiền chuyển qua VND: "+formatter.format(usd*23000)+"VNĐ");
    }
}
