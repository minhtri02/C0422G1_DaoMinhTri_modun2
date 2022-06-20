package ss11_stack_queue.exercises;

import groovyjarjarpicocli.CommandLine;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracketsInStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào biểu thức số học");
        String expression = scanner.nextLine();
        String ngoacTrai = "(";
        String ngoacPhai = ")";
        Stack<Character> stack = new Stack<>();
        boolean flag = true;
        if (expression.length()==0){
            System.out.println("Biểu thức nhập không đúng!");
        }else {
            for (int i = 0; i < expression.length(); i++) {
                if (expression.charAt(i) == ngoacTrai.charAt(0)) {
                    stack.push(expression.charAt(i));
                    continue;
                }
                if (expression.charAt(i) == ngoacPhai.charAt(0)) {
                    if (!stack.isEmpty()) {
                        if (stack.peek() != expression.charAt(i)) {
                            stack.pop();
                        }
                    } else {
                        stack.push(expression.charAt(i));
                        flag = false;
                        break;
                    }
                }
            }
            System.out.println(stack);
            if (flag){
                if (stack.isEmpty()) System.out.println("Sử dụng đúng dấu ngoặc!");
                else System.out.println("Không sử dụng đúng");
            }else System.out.println("Không sử dụng đúng");
        }



    }
}
