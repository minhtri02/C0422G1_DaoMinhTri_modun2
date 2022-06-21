package service.Implement;

import common.DecreasePrice;
import model.SanPham;
import service.IproductSevice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductService implements IproductSevice {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<SanPham> sanPhams = new ArrayList<>();
    static{
        sanPhams.add(new SanPham(1,"tri",123));
        sanPhams.add(new SanPham(2,"tri",234));
        sanPhams.add(new SanPham(3,"tri",345));
        sanPhams.add(new SanPham(4,"tri",456));
        sanPhams.add(new SanPham(5,"tri",567));
    }

    @Override
    public void addSP() {
        System.out.println("Chức năng Thêm sản phầm");
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        double price = Double.parseDouble(scanner.nextLine());
        SanPham sanPham = new SanPham(id, name, price);
        sanPhams.add(sanPham);
        System.out.println("Đã thêm thành công!");
        hienthiSP();
    }

    @Override
    public void edit() {
        boolean flag = true;
        System.out.println("Chức năng edit sản phẩm theo id");
        System.out.println("Nhập id cần edit");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < sanPhams.size(); i++) {
            if (sanPhams.get(i).getId() == id) {
                flag = false;
                System.out.println("Nhập id");
                int id1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập tên sản phẩm");
                String name = scanner.nextLine();
                System.out.println("Nhập giá sản phẩm");
                double price = Double.parseDouble(scanner.nextLine());
                SanPham sanPham = new SanPham(id1, name, price);
                sanPhams.set(i, sanPham);
                System.out.println("Đã sửa thành công!");
            }
        }
        if (flag) {
            System.out.println("không tìm thấy id sản phẩm");
        }
        hienthiSP();
    }

    @Override
    public void delete() {
        boolean flag = true;
        System.out.println("Chức năng xoá sản phẩm theo id");
        System.out.println("Nhập id cần xoá");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < sanPhams.size(); i++) {
            if (sanPhams.get(i).getId() == id) {
                sanPhams.remove(i);
                System.out.println("Đã xoá thành công");
                flag=false;
            }
        }
        if (flag){
            System.out.println("Không tìm thấy id cần xoá!");
        }
        hienthiSP();
    }

    @Override
    public void sortUp() {
        Collections.sort(sanPhams);
        hienthiSP();
    }

    @Override
    public void hienthiSP() {
        for (SanPham s : sanPhams) {
            System.out.println(s);
        }
    }

    @Override
    public void sortDown() {
        DecreasePrice decreasePrice = new DecreasePrice();
        Collections.sort(sanPhams , decreasePrice);
        hienthiSP();
    }


}
