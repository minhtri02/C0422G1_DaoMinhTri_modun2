package service;

import model.Customer;
import until.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Customer> listCustomer = new ArrayList<>();

    @Override
    public void Add() {
        System.out.println("CHỨC NĂNG TẠO KHÁCH HÀNG");
        System.out.println("Nhập mã khách hàng (String)");
        String idKH = scanner.nextLine();
        System.out.println("Nhập Tên khách hàng (String)");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh (String)");
        String ngaySinh = scanner.nextLine();
        System.out.println("Nhập giới tính (int)");
        int gioiTinh = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số CMND (int)");
        int cmnd = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Số điện thoại (int)");
        int sdt = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email (String)");
        String email = scanner.nextLine();
        System.out.println("Chọn loại khách hàng");
        for (String s : Customer.getListLoaiKhach()
        ) {
            System.out.println(s);
        }
        int choose = Integer.parseInt(scanner.nextLine());
        String loaikhach = null;
        switch (choose) {
            case 1:
                loaikhach = Customer.getListLoaiKhach().get(0);
                break;
            case 2:
                loaikhach = Customer.getListLoaiKhach().get(1);
                break;
            case 3:
                loaikhach = Customer.getListLoaiKhach().get(2);
                break;
            case 4:
                loaikhach = Customer.getListLoaiKhach().get(3);
                break;
            case 5:
                loaikhach = Customer.getListLoaiKhach().get(4);
                break;
            default:
                System.exit(0);
        }
        System.out.println("Nhập địa chỉ (String)");
        String diaChi = scanner.nextLine();
        Customer customer = new Customer(idKH,name,ngaySinh,gioiTinh,cmnd,sdt,email,loaikhach,diaChi);
//        readCustomer();
//        listCustomer.add(customer);
//        writeCustomer(listCustomer);
        writeCustomer(customer);
        display();
    }

    @Override
    public void Edit() {
        System.out.println("CHỨC NĂNG EDIT KHÁCH HÀNG");
        System.out.println("Nhập id khách hàng cần edit");
        String makh = scanner.nextLine();
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < listCustomer.size(); i++) {
            if (listCustomer.get(i).getId().equals(makh)) {
                index = i;
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Nhập mã khách hàng (String)");
            String idKH = scanner.nextLine();
            System.out.println("Nhập Tên khách hàng (String)");
            String name = scanner.nextLine();
            System.out.println("Nhập ngày sinh (String)");
            String ngaySinh = scanner.nextLine();
            System.out.println("Nhập giới tính (int)");
            int gioiTinh = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập số CMND (int)");
            int cmnd = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập Số điện thoại (int)");
            int sdt = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập email (String)");
            String email = scanner.nextLine();
            System.out.println("Chọn loại khách hàng");
            for (String s : Customer.getListLoaiKhach()
            ) {
                System.out.println(s);
            }
            int choose = Integer.parseInt(scanner.nextLine());
            String loaikhach = null;
            switch (choose) {
                case 1:
                    loaikhach = Customer.getListLoaiKhach().get(0);
                    break;
                case 2:
                    loaikhach = Customer.getListLoaiKhach().get(1);
                    break;
                case 3:
                    loaikhach = Customer.getListLoaiKhach().get(2);
                    break;
                case 4:
                    loaikhach = Customer.getListLoaiKhach().get(3);
                    break;
                case 5:
                    loaikhach = Customer.getListLoaiKhach().get(4);
                    break;
                default:
                    System.exit(0);
            }
            System.out.println("Nhập địa chỉ (String)");
            String diaChi = scanner.nextLine();
            Customer customer = new Customer(idKH, name, ngaySinh, gioiTinh, cmnd, sdt, email, loaikhach, diaChi);
            readCustomer();
            listCustomer.set(index, customer);
//            writeCustomer(listCustomer);

            display();
        }
    }

    @Override
    public void Remove() {
        System.out.println("CHỨC NĂNG XOÁ KHÁCH HÀNG");
        boolean flag = true;
        do {
            System.out.println("Nhập id khách hàng cần xoá (String)");
            String idKH = scanner.nextLine();
            for (int i = 0; i < listCustomer.size(); i++) {
                if (listCustomer.get(i).getId() == idKH) {
                    flag = false;
                    listCustomer.remove(i);
                    System.out.println("Đã xoá thành công");
                }
            }
        } while (flag);
//        writeCustomer(listCustomer);
        List<String> list=readCustomer();
        Customer customer ;
        String[] arr;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            customer = new Customer(arr[0], arr[1], arr[2], Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), arr[6], arr[7], arr[8]);
            writeCustomer(customer,);
        }
            display();
    }


    @Override
    public void display() {
        List<String> list=readCustomer();
        Customer customer ;
        String[] arr;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            customer = new Customer(arr[0],arr[1],arr[2],Integer.parseInt(arr[3]),Integer.parseInt(arr[4]),Integer.parseInt(arr[5]),arr[6],arr[7],arr[8]);
            System.out.println(customer);
        }
    }

    public List<String> readCustomer(){
        List<String> list ;
        list = ReadAndWrite.reader("D:\\codegym\\C0422G1_DaoMinhTri_modun2\\case_study\\src\\controrler\\data\\customer.csv");

        return list;
    }

    public void writeCustomer(Customer customer, boolean flag){
        List<String> arr = null;
        arr.add(customer.getInfoToString());
        ReadAndWrite.write(arr , "src/controrler/data/customer.csv",flag);
    }
}
