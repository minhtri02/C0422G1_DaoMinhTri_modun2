package model;

public class House extends Facility{
    private String tieuChuanPhong;
    private int soTang;

    public House() {
    }

    public House(String idFacility,String nameFacility, double dienTichSuDung, double chiPhiThue, int soNguoiToiDa, int kieuThue, String tieuChuanPhong, int soTang) {
        super(idFacility,nameFacility, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String getInForToString() {
        return super.getInForToString()+","+tieuChuanPhong+","+soTang;
    }

    @Override
    public String toString() {
        return "House{" +super.toString()+
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", soTang=" + soTang +
                '}';
    }
}
