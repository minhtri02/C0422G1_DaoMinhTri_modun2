package giai_thuat;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class TachTu {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        ArrayList<Character> arrayList = new ArrayList<>();
        arrayList.add(string.charAt(0));
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                arrayList.add(' ');
                arrayList.add(string.charAt(i));
            } else {
                arrayList.add(string.charAt(i));
            }
        }
        String str = "";
        for (Character c : arrayList) {
            str+=c;
        }
        System.out.println(str.toLowerCase());
    }
}
