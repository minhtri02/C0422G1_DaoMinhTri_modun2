package exercises_to_work.vehicle_management;

public  class HangSanXuat {
    private String idMaSanXuat;
    private String tenHang;
    private String quocGia;

    public HangSanXuat(String idMaSanXuat, String tenHang, String quocGia) {
        this.idMaSanXuat = idMaSanXuat;
        this.tenHang = tenHang;
        this.quocGia = quocGia;
    }

    @Override
    public String toString() {
        return "HangSanXuat{" +
                "idMaSanXuat='" + idMaSanXuat + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", quocGia='" + quocGia + '\'' +
                '}';
    }

    public String getIdMaSanXuat() {
        return idMaSanXuat;
    }

    public String getTenHang() {
        return tenHang;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setIdMaSanXuat(String idMaSanXuat) {
        this.idMaSanXuat = idMaSanXuat;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }
}
