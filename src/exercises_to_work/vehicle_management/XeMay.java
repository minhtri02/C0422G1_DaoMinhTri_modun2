package exercises_to_work.vehicle_management;

public class XeMay extends VienKiemSoat{
    private double congSuat;

    public XeMay() {
    }


    public XeMay(double congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(String bienKiemSoat, Object hangSanXuat, String chuSohuu, int namSanXuat, double congSuat) {
        super(bienKiemSoat, hangSanXuat, chuSohuu, namSanXuat);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }
}
