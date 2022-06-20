package exercises_to_work.vehicle_management;

public class Oto extends VienKiemSoat{
    private int soCho;
    private String kieuXe;

    public Oto() {
    }

    public Oto(int soCho, String kieuXe) {
        this.soCho = soCho;
        this.kieuXe = kieuXe;
    }

    public Oto(String bienKiemSoat, Object hangSanXuat, String chuSohuu, int namSanXuat, int soCho, String kieuXe) {
        super(bienKiemSoat, hangSanXuat, chuSohuu, namSanXuat);
        this.soCho = soCho;
        this.kieuXe = kieuXe;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }
}
