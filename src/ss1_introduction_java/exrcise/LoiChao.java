package ss1_introduction_java.exrcise;

import java.util.Scanner;

public class LoiChao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine() ;
        System.out.println("Hello: "+name);
    }
}