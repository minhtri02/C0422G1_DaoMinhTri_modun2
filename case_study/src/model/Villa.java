package model;

public class Villa extends Facility{
    private String tieuChuanPhong;
    private double dienTichHoBoi;
    private int soTang;

    public Villa() {
    }

    public Villa(String idFacility,String nameFacility, double dienTichSuDung, double chiPhiThue, int soNguoiToiDa, int kieuThue, String tieuChuanPhong, double dienTichHoBoi, int soTang) {
        super(idFacility,nameFacility, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String getInForToString() {
        return super.getInForToString()+","+tieuChuanPhong+","+dienTichHoBoi+","+soTang;
    }

    @Override
    public String toString() {
        return "Villa{" +super.toString()+
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", dienTichHoBoi=" + dienTichHoBoi +
                ", soTang=" + soTang +
                '}';
    }
}
