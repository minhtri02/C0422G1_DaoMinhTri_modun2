package controller;

import model.SanPham;
import service.Implement.ProductService;
import service.Iservice;

import java.util.ArrayList;
import java.util.Scanner;

public class DisplayMenu {

    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        ProductService productService = new ProductService();
        int choose;
        boolean flag = true;
        do {
            System.out.println("QUẢN LÝ SẢN PHẨM");
            System.out.println("1. Thêm sản phẩm \n" +
                    "2. Sửa thông tin sản phẩm theo id\n" +
                    "3. Xoá sản phầm theo id\n" +
                    "4. Hiển thị danh sách sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm \n" +
                    "6. Tăng dần, giảm dần theo giá\n" +
                    "7. thoát");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    productService.addSP();
                    break;
                case 2:
                    productService.edit();
                    break;
                case 3:
                    productService.delete();
                    break;
                case 4:
                    productService.hienthiSP();
                    break;
                case 5:

                    break;
                case 6:
                    productService.hienthiSP();
                    System.out.println("danh sách xếp tăng");
                    productService.sortUp();
                    System.out.println("danh sách xếp giảm");
                    productService.sortDown();
                    break;
                case 7:
                    flag=false;
                    System.out.println("Tạm biệt");
                    break;
                default:
                    System.out.println("Bạn nhập sai, vui lòng nhập lại");
            }

        }while (flag);
    }

}
