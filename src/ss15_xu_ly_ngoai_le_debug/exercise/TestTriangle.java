package ss15_xu_ly_ngoai_le_debug.exercise;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();


        do {
            try {
                System.out.println("Nhập cạnh a");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập cạnh b");
                int b =  Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập cạnh c");
                int c =  Integer.parseInt(scanner.nextLine());
                triangle = new Triangle(a,b,c);
                break;
            }
            catch (IllegalTriangleException e){
                System.out.println(e.getMessage());

            }
            catch (Exception e){
                e.printStackTrace();

            }

        } while (true);
        System.out.println(triangle);
    }
}
