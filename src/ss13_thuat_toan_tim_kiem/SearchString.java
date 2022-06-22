package ss13_thuat_toan_tim_kiem;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class SearchString {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi liên tiếp");
        Scanner scanner = new Scanner(System.in);
        String banana = scanner.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> list1= new LinkedList<>();
        for (int i = 0; i < banana.length(); i++) {
            list1.add(banana.charAt(i));
            for (int j = i + 1; j < banana.length(); j++) {
                if (list1.getLast() < banana.charAt(j)) {
                    list1.add(banana.charAt(j));
                } else {
                    break;
                }
            }
            if (list1.size() > list.size()) {
                list.clear();
                list.addAll(list1);
            }
            list1.clear();
        }
        for (Character s : list) {
            System.out.print(s);
        }
    }
}
