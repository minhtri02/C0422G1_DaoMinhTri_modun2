package service.Iml;

import Common.CheckRegex;
import model.Customer;
import service.ICustomerService;
import until.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH_FILE_CUSTOMER = "D:\\codegym\\C0422G1_DaoMinhTri_modun2\\case_study\\src\\controrler\\data\\customer.csv";

    @Override
    public void Add() {
        System.out.println("------CHỨC NĂNG TẠO KHÁCH HÀNG------");
        System.out.println("Nhập mã khách hàng (String)");
        String idKH = scanner.nextLine();
        System.out.println("Nhập Tên khách hàng (String)");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh (String)");
        String ngaySinh = scanner.nextLine();
        String gioiTinh = "";
        while (gioiTinh.equals("")) {
            System.out.println("Nhập giới tính (int)\n" +
                    "1. Nam\n" +
                    "2. Nữ\n");
            gioiTinh= scanner.nextLine();
            if (gioiTinh.equals("1")) gioiTinh = "Nam";
            else if (gioiTinh.equals("2")) gioiTinh = "Nữ";
            else System.err.println("Sai cú pháp");
        }
        Integer sdt = 0;
        int cmnd = 0;
        try{
            System.out.println("Nhập số CMND (int)");
            cmnd = Integer.parseInt(scanner.nextLine());

            do {
                System.out.println("Nhập Số điện thoại (int)");
                sdt = Integer.parseInt(scanner.nextLine());
            }while (!CheckRegex.checkRegexFacilitySDT(sdt.toString()));
        }catch (Exception e){
            System.err.println("Sai kiểu dữ liệu");
            e.printStackTrace();
        }

        String email;
        do {
            System.out.println("Nhập email (String)");
            email = scanner.nextLine();
        }while (!CheckRegex.checkRegexFacilityEmail(email));

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
        ReadAndWrite.writeAll(customer.getInfoToString(),PATH_FILE_CUSTOMER,true);
//        List<Customer> list = new ArrayList<>();
//        list.add(customer);
//
//        ReadAndWrite.writerCustomer(list,PATH_FILE_CUSTOMER,true);
        display();
    }

    @Override
    public void Edit() {
        List<Customer> list = ReadAndWrite.readCustomer(PATH_FILE_CUSTOMER);
        boolean flag = true;
        int index =0;
        do {
            System.out.println("------CHỨC NĂNG EDIT KHÁCH HÀNG------");
            System.out.println("Nhập id khách hàng cần edit");
            String makh = scanner.nextLine();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId().equals(makh)) {
                    index = i;
                    flag = false;
                    break;
                }
            }
            if (flag) System.err.println("ID khách hàng sai!");
        }while (flag);

        System.out.println("Nhập mã khách hàng (String)");
        String idKH = scanner.nextLine();
        System.out.println("Nhập Tên khách hàng (String)");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh (String)");
        String ngaySinh = scanner.nextLine();
        String gioiTinh = "";
        while (gioiTinh.equals("")) {
            System.out.println("Nhập giới tính (int)\n" +
                    "1. Nam\n" +
                    "2. Nữ\n");
            gioiTinh= scanner.nextLine();
            if (gioiTinh.equals("1")) gioiTinh = "Nam";
            else if (gioiTinh.equals("2")) gioiTinh = "Nữ";
            else System.err.println("Sai cú pháp");
        }
        Integer sdt = 0;
        int cmnd = 0;
        try{
            System.out.println("Nhập số CMND (int)");
            cmnd = Integer.parseInt(scanner.nextLine());

            do {
                System.out.println("Nhập Số điện thoại (int)");
                sdt = Integer.parseInt(scanner.nextLine());
            }while (!CheckRegex.checkRegexFacilitySDT(sdt.toString()));
        }catch (Exception e){
            System.err.println("Sai kiểu dữ liệu");
            e.printStackTrace();
        }

        String email;
        do {
            System.out.println("Nhập email (String)");
            email = scanner.nextLine();
        }while (!CheckRegex.checkRegexFacilityEmail(email));
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
                list.set(index,customer);
                ReadAndWrite.writerCustomer(list, PATH_FILE_CUSTOMER, false);
                display();
    }



    @Override
    public void display() {
        List<Customer> list = ReadAndWrite.readCustomer(PATH_FILE_CUSTOMER);
        for (Customer s : list) {
            System.out.println(s.toString());
        }
    }
}
