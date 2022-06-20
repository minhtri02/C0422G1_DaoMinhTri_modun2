package exercises_to_work.vehicle_management;

import java.util.ArrayList;

public class XeTai extends VienKiemSoat{
    private double trongTai;

    public XeTai() {
    }

    public XeTai(double trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String bienKiemSoat, Object hangSanXuat, String chuSohuu, int namSanXuat, double trongTai) {
        super(bienKiemSoat, hangSanXuat, chuSohuu, namSanXuat);
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +super.toString()+
                "trongTai=" + trongTai +
                '}';
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }


}
