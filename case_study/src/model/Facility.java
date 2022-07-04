package model;

public abstract class Facility {
    private String idFacility;
    private String nameFacility;
    private double dienTichSuDung;
    private double chiPhiThue;
    private int soNguoiToiDa;
    private int kieuThue;

    public Facility() {
    }

    public Facility(String idFacility, String nameFacility, double dienTichSuDung, double chiPhiThue, int soNguoiToiDa, int kieuThue) {
        this.idFacility = idFacility;
        this.nameFacility = nameFacility;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soNguoiToiDa = soNguoiToiDa;
        this.kieuThue = kieuThue;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getNameFacility() {
        return nameFacility;
    }

    public void setNameFacility(String nameFacility) {
        this.nameFacility = nameFacility;
    }

    public double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(int soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public int getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(int kieuThue) {
        this.kieuThue = kieuThue;
    }

    public String getInForToString() {
        return idFacility + "," + nameFacility + "," + dienTichSuDung + "," + chiPhiThue + "," + soNguoiToiDa + "," + kieuThue;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "idFacility='" + idFacility + '\'' +
                ", nameFacility='" + nameFacility + '\'' +
                ", dienTichSuDung=" + dienTichSuDung +
                ", chiPhiThue=" + chiPhiThue +
                ", soNguoiToiDa=" + soNguoiToiDa +
                ", kieuThue=" + kieuThue +
                '}';
    }
}
