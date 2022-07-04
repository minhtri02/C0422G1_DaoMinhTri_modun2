package service.Iml;

import Common.CheckRegex;
import model.Facility;
import model.Room;
import model.Villa;
import service.IVillaService;
import until.ReadAndWrite;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class VillaServiceImpl implements IVillaService {

    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH_FILE_ROOM = "D:\\codegym\\C0422G1_DaoMinhTri_modun2\\case_study\\src\\controrler\\data\\Facility.csv";
    private static int mun =0;
    @Override
    public void createVilla() {
        System.out.println("---------CHỨC NĂNG THÊM VILLA---------");

        String id = "SVVL-";
        do {
            System.out.print("Nhập mã dịch vụ (gồm có 4 số): ");
            id += scanner.nextLine();
        } while (!CheckRegex.checkRegexFacilityId(id));

        String name;
        do {
            System.out.println("Nhập tên Room (String)");
            name = scanner.nextLine();
        }while (!CheckRegex.checkRegexFacilityName(name));

        double dienTich;
        double chiPhiThue;
        int soNguoi;
        int kieuThue;
        double dienTichHoBoi;
        int soTang;
        try{
            do {
                System.out.println("Nhập diện tích sử dụng (Double)");
                dienTich = Double.parseDouble(scanner.nextLine());
            } while (dienTich <= 30);

            do {
                System.out.println("Nhập chi phí thuê (Double)");
                chiPhiThue = Double.parseDouble(scanner.nextLine());
            } while (chiPhiThue <= 0);

            do {
                System.out.println("Nhập số người (int)");
                soNguoi = Integer.parseInt(scanner.nextLine());
            } while (soNguoi > 20 && soNguoi < 0);
            System.out.println("Nhập kiểu thuê (int)");
            kieuThue = Integer.parseInt(scanner.nextLine());
            do {
                System.out.println("Diện tích hồ bơi (Double)");
                dienTichHoBoi = Double.parseDouble(scanner.nextLine());
            }while (dienTichHoBoi<=30);

            do {
                System.out.println("Nhập số tầng (int)");
                soTang = Integer.parseInt(scanner.nextLine());
            }while (soTang<0);
        }catch (NumberFormatException e){
            System.err.println("Sai kiểu dữ liệu");
            return;
        }
        System.out.println("Tiêu chuẩn phòng (String)");
        String tieuChuanPhong = scanner.nextLine();
        Villa villa = new Villa(id,name,dienTich,chiPhiThue,soNguoi,kieuThue,tieuChuanPhong,dienTichHoBoi,soTang);
        Map<Facility, Integer> integerMap = new LinkedHashMap<>();
        integerMap.put(villa,mun);
        ReadAndWrite.writeFacility(integerMap,PATH_FILE_ROOM,true);
        display();
    }

    @Override
    public void display() {
        Map<Facility,Integer> integerMap = ReadAndWrite.readFacilityToCSV(PATH_FILE_ROOM);
        Set<Facility> set = integerMap.keySet();
        for (Facility facility : set) {
            System.out.println(facility.toString() + "," + integerMap.get(facility));
        }
    }
}
