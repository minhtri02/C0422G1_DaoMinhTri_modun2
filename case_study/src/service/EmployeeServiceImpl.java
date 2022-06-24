package service;

import model.Employee;
import sun.font.FontRunIterator;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService{
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Employee> employees = new ArrayList<>();
    @Override
    public void Add() {
        {
            System.out.println("CHỨC NĂNG THÊM NHÂN VIÊN");
            System.out.println("Nhập mã nhân viên (String)");
            String idNV = scanner.nextLine();
            System.out.println("Nhập Tên nhân viên (String)");
            String name = scanner.nextLine();
            System.out.println("Nhập ngày sinh (String)");
            String ngaySinh = scanner.nextLine();
            System.out.println("Nhập giới tính (int)");
            int gioiTinh= Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập số CMND (int)");
            int cmnd = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập Số điện thoại (int)");
            int sdt = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập email (String)");
            String email = scanner.nextLine();
            System.out.println("Chọn trình độ của bạn");
            for (String s: Employee.getListTringDo()) {
                System.out.println(s);
            }
            int chon1 = Integer.parseInt(scanner.nextLine());
            String trinhDo;
            switch (chon1){
                case 1:
                    trinhDo = Employee.getListTringDo().get(0);
                    break;
                case 2:
                    trinhDo = Employee.getListTringDo().get(1);
                    break;
                case 3:
                    trinhDo = Employee.getListTringDo().get(2);
                    break;
                case 4:
                    trinhDo = Employee.getListTringDo().get(3);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + chon1);
            }
            System.out.println("Chọn vị trí");
            for (String s: Employee.getListViTri()) {
                System.out.println(s);
            }
            int chon2 = Integer.parseInt(scanner.nextLine());
            String vitri;
            switch (chon2){
                case 1:
                    vitri = Employee.getListViTri().get(0);
                    break;
                case 2:
                    vitri = Employee.getListViTri().get(1);
                    break;
                case 3:
                    vitri = Employee.getListViTri().get(2);
                    break;
                case 4:
                    vitri = Employee.getListViTri().get(3);
                    break;
                case 5:
                    vitri = Employee.getListViTri().get(4);
                    break;
                case 6:
                    vitri = Employee.getListViTri().get(5);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + chon2);
            }
            System.out.println("Nhập số lương");
            double luong = Double.parseDouble(scanner.nextLine());
            Employee employee = new Employee(idNV,name,ngaySinh,gioiTinh,cmnd,sdt,email,trinhDo,vitri,luong);
            employees.add(employee);
            display();
        }
    }

    @Override
    public void Edit() {
        System.out.println("CHỨC NĂNG EDIT NHÂN VIÊN");
        System.out.println("Nhập id nhân viên cần edit");
        String manv = scanner.nextLine();
        int index =0;
        boolean flag = false;
            for (int i = 0; i < employees.size(); i++) {
                if (employees.get(i).getId() == manv){
                    index=i;
                    flag=true;
                }
            }
       if (flag) {
           System.out.println("Nhập mã nhân viên (String)");
           String idNV = scanner.nextLine();
           System.out.println("Nhập Tên nhân viên (String)");
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
           System.out.println("Chọn trình độ của bạn");
           for (String s : Employee.getListTringDo()) {
               System.out.println(s);
           }
           int chon1 = Integer.parseInt(scanner.nextLine());
           String trinhDo;
           switch (chon1) {
               case 1:
                   trinhDo = Employee.getListTringDo().get(0);
                   break;
               case 2:
                   trinhDo = Employee.getListTringDo().get(1);
                   break;
               case 3:
                   trinhDo = Employee.getListTringDo().get(2);
                   break;
               case 4:
                   trinhDo = Employee.getListTringDo().get(3);
                   break;
               default:
                   throw new IllegalStateException("Unexpected value: " + chon1);
           }
           System.out.println("Chọn vị trí");
           for (String s : Employee.getListViTri()) {
               System.out.println(s);
           }
           int chon2 = Integer.parseInt(scanner.nextLine());
           String vitri;
           switch (chon2) {
               case 1:
                   vitri = Employee.getListViTri().get(0);
                   break;
               case 2:
                   vitri = Employee.getListViTri().get(1);
                   break;
               case 3:
                   vitri = Employee.getListViTri().get(2);
                   break;
               case 4:
                   vitri = Employee.getListViTri().get(3);
                   break;
               case 5:
                   vitri = Employee.getListViTri().get(4);
                   break;
               case 6:
                   vitri = Employee.getListViTri().get(5);
                   break;
               default:
                   throw new IllegalStateException("Unexpected value: " + chon2);
           }
           System.out.println("Nhập số lương");
           double luong = Double.parseDouble(scanner.nextLine());
           Employee employee = new Employee(idNV, name, ngaySinh, gioiTinh, cmnd, sdt, email, trinhDo, vitri, luong);
           employees.set(index, employee);
           display();
       }
    }

    @Override
    public void Remove() {
        System.out.println("CHỨC NĂNG REMOVE NHÂN VIÊN");
        System.out.println("Nhập id nhân viên cần xoá");
        String manv = scanner.nextLine();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == manv){
                employees.remove(i);
            }
        }
        display();
    }

    @Override
    public void display() {
        for (Employee s : employees) {
            System.out.println(s);
        }
    }
}
