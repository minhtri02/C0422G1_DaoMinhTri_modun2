package service.Iml;

import Common.CheckRegex;
import model.Employee;
import service.IEmployeeService;
import sun.font.FontRunIterator;
import until.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    private static Scanner scanner = new Scanner(System.in);
    private final String PATH_FILE_EMPLOYEE ="D:\\codegym\\C0422G1_DaoMinhTri_modun2\\case_study\\src\\controrler\\data\\employee.csv";
    @Override
    public void Add() {
        {
            System.out.println("------CHỨC NĂNG THÊM NHÂN VIÊN------");
            System.out.println("Nhập mã nhân viên (String)");
            String idNV = scanner.nextLine();
            System.out.println("Nhập Tên nhân viên (String)");
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
//            employees.add(employee);
            ReadAndWrite.writeAll(employee.getInfoToString(),PATH_FILE_EMPLOYEE,true);
            display();
        }
    }

    @Override
    public void Edit() {
        List<Employee> employees = ReadAndWrite.readEmployee(PATH_FILE_EMPLOYEE);
        System.out.println("------CHỨC NĂNG EDIT NHÂN VIÊN-------");
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
           ReadAndWrite.writeEmployee(employees,PATH_FILE_EMPLOYEE,false);
           display();
       }
    }


    @Override
    public void display() {
        List<Employee> employeeList = ReadAndWrite.readEmployee(PATH_FILE_EMPLOYEE);
        for (Employee e: employeeList) {
            System.out.println(e.toString());
        }
    }
}
