package ss17_binary_file_serialization.exercise.ProductManagerment.controller;

import ss17_binary_file_serialization.exercise.ProductManagerment.service.ProductImplService;

import java.util.Scanner;

public class Menu {
    public static void displayMenu(){
        ProductImplService productImplService = new ProductImplService();
        boolean flag = true;
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÍ HÀNG HÓA" +
                    "\n Chọn chức năng:" +
                    "\n 1. Thêm mới hàng hóa" +
                    "\n 2. Hiển thị hàng hóa" +
                    "\n 3. Tìm kiếm hàng hóa theo tên sản phẩm" +
                    "\n 4. Thoát");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    productImplService.add();
                    break;
                case 2:
                    productImplService.display();
                    break;
                case 3:
                    productImplService.search();
                    break;
                case 4:
                    flag = false;
                    System.out.println("see you later!");
                    break;
                default:
                    System.out.println("Bạn nhập chức năng sai, nhập lại:");
            }
        }while (flag);
    }
}
