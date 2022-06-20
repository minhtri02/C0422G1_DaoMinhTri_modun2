package exercises_to_work.vehicle_management;

public abstract class VienKiemSoat {
    private String bienKiemSoat;
    private Object hangSanXuat ;
    private String chuSohuu;
    private int namSanXuat;

    public VienKiemSoat() {
    }

    public VienKiemSoat(String bienKiemSoat, Object hangSanXuat, String chuSohuu, int namSanXuat) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangSanXuat = hangSanXuat;
        this.chuSohuu = chuSohuu;
        this.namSanXuat = namSanXuat;
    }

    @Override
    public String toString() {
        return "VienKiemSoat{" +
                "bienKiemSoat='" + bienKiemSoat + '\'' +
                ", hangSanXuat=" + hangSanXuat +
                ", chuSohuu='" + chuSohuu + '\'' +
                ", namSanXuat=" + namSanXuat +
                '}';
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public Object getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(Object hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getChuSohuu() {
        return chuSohuu;
    }

    public void setChuSohuu(String chuSohuu) {
        this.chuSohuu = chuSohuu;
    }
}
