package exercises_to_work.vehicle_management;

import java.util.ArrayList;
import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Display();
    }
/* Menu chức năng được hiển thị khi mở chương trình*/
    public static void Display(){
        VehicleManagement vehicleManagement = new VehicleManagement();
        ArrayList<Object> objects = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        int choose;
        boolean isNot = true;
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIÊN GIAO THÔNG");
            System.out.println("Chọn chức năng:");
            System.out.println("1. Thêm mới phương tiện\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xoá phương tiện\n" +
                    "4. Tìm kiếm theo biển kiểm soát\n" +
                    "5. Thoát");
            choose = scn.nextInt();

            switch (choose){
                case 1:
                    vehicleManagement.addVehicle();
                    System.out.println(vehicleManagement.xeTais);;
                    break;
                case 2:
                    System.out.println(objects);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    isNot = false;
                    break;
                default:
                    System.out.println("Không có chức năng này, vui lòng nhập lại!");
            }
        }while (isNot);
    }


}
