package ss11_stack_queue.exercises;

import java.util.Scanner;
import java.util.Stack;

public class DecimalConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển qua hệ nhị phân");
        int num = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        while (num>0){
            System.out.print(num%2);
            stack.add(num%2);
            num = num/2;
        }
        System.out.println();
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.print(stack.pop());
        }
    }

}
