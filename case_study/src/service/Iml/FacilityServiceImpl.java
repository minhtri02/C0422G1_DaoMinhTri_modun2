package service.Iml;

import model.Facility;
import service.IFacilityService;
import until.ReadAndWrite;

import java.util.Map;
import java.util.Set;

public class FacilityServiceImpl implements IFacilityService {
private static String PATH_FILE_FACILITY = "D:\\codegym\\C0422G1_DaoMinhTri_modun2\\case_study\\src\\controrler\\data\\Facility.csv";
    @Override
    public void display() {
        Map<Facility,Integer> integerMap = ReadAndWrite.readFacilityToCSV(PATH_FILE_FACILITY);
        Set<Facility> set = integerMap.keySet();
        for (Facility facility : set) {
            System.out.println(facility.toString() + "," + integerMap.get(facility));
        }
    }
//    @Override
//    public void displayMaintain() {
//
//    }

    @Override
    public void addNewVilla() {
        VillaServiceImpl villaService = new VillaServiceImpl();
        villaService.createVilla();
    }

    @Override
    public void addNewHouse() {
        HouseServiceImpl houseService = new HouseServiceImpl();
        houseService.createHouse();
    }

    @Override
    public void addNewRoom() {
        RoomServiceImpl roomService = new RoomServiceImpl();
        roomService.createRoom();
    }
}
