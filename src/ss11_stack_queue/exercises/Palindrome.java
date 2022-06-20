package ss11_stack_queue.exercises;

import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi để kiểm tra Palindrome");
        String chain = scanner.nextLine();
        String newChain = chain.toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < newChain.length(); i++) {
            stack.push(newChain.charAt(i));
        }
        System.out.println(stack);

        if (isTrue(stack, newChain)) System.out.println("Là chuỗi Palindrome!");
        else System.out.println("Không phải là chuỗi Palindrome!");
    }

    public static boolean isTrue(Stack<Character> stack, String chuoi) {
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
