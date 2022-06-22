package ss13_thuat_toan_tim_kiem;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

public class SortAscending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi ");
        String banana = scanner.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> list1 ;
        for (int i = 0; i < banana.length(); i++) {
            list1 = new LinkedList<>();
            list1.add(banana.charAt(i));
            for (int j = i + 1; j < banana.length(); j++) {
                if (list1.getLast() < banana.charAt(j)) {
                    list1.add(banana.charAt(j));
                }
            }
            if (list1.size() > list.size()) {
                list.clear();
                list.addAll(list1);
            }
        }
        for (Character s : list) {
            System.out.print(s);
        }
        System.out.println();
    }
}
