package model;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(String idFacility, String nameFacility, double dienTichSuDung, double chiPhiThue, int soNguoiToiDa, int kieuThue, String freeService) {
        super(idFacility,nameFacility, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String getInForToString() {
        return super.getInForToString()+","+freeService;
    }

    @Override
    public String toString() {
        return "Room{" +super.toString()+
                "freeService='" + freeService + '\'' +
                '}';
    }
}
