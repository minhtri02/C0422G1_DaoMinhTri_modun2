package service.Iml;

import Common.CheckRegex;
import model.Facility;
import model.Room;
import service.IRoomService;
import until.ReadAndWrite;

import java.util.*;

public class RoomServiceImpl implements IRoomService {
private static Scanner scanner = new Scanner(System.in);
private static final String PATH_FILE_ROOM = "D:\\codegym\\C0422G1_DaoMinhTri_modun2\\case_study\\src\\controrler\\data\\Facility.csv";
private static int mun =0;
    @Override
    public void createRoom() {
        System.out.println("---------CHỨC NĂNG THÊM ROOM---------");
        String id = "SVRO-";
        do {
            System.out.print("Nhập mã dịch vụ (gồm có 4 số): ");
            id += scanner.nextLine();
        } while (!CheckRegex.checkRegexFacilityId(id));

        String name;
        do {
            System.out.println("Nhập tên Room (String)");
            name = scanner.nextLine();
        }while (!CheckRegex.checkRegexFacilityName(name));

        double dienTich=0;
        double chiPhiThue=0;
        int soNguoi=0;
        int kieuThue=0;
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
        }catch (NumberFormatException e){
            System.err.println("Sai kiểu dữ liệu");
            return;
        }

        System.out.println("Nhập dịch vụ miễn phí (String)");
        String freeService = scanner.nextLine();
        Room room = new Room(id,name,dienTich,chiPhiThue,soNguoi,kieuThue,freeService);
//        ReadAndWrite.writeAll(room.getInForToString(),PATH_FILE_ROOM,true);
        Map<Facility, Integer> integerMap = new LinkedHashMap<>();
        integerMap.put(room,mun);
        ReadAndWrite.writeFacility(integerMap,PATH_FILE_ROOM,true);
        displayRoom();
    }

    @Override
    public void displayRoom() {
        Map<Facility,Integer> integerMap = ReadAndWrite.readFacilityToCSV(PATH_FILE_ROOM);
        Set<Facility> set = integerMap.keySet();
        for (Facility facility : set) {
            System.out.println(facility.toString() + "," + integerMap.get(facility));
        }
    }
}
