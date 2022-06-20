package ss11_stack_queue.exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử trong mảng");
        int num = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        int[] array = new int[num];
        for (int i=0;i<num;i++) {
            System.out.println("Nhập phần tử thứ "+(i+1));
            array[i] = scanner.nextInt();
            stack.add(array[i]);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i]=stack.pop();
        }
        System.out.println(Arrays.toString(array));
    }

}
