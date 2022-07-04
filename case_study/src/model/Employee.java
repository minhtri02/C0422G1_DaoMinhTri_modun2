package model;

import java.util.ArrayList;
import java.util.Date;

public class Employee extends Person {
    private String tringDo;
    private String viTri;
    private double luong;

    static ArrayList<String> listViTri = new ArrayList<>();
    static ArrayList<String> listTringDo = new ArrayList<>();
    static {
        listTringDo.add("Trung cấp");
        listTringDo.add("Cao đẳng");
        listTringDo.add("Đại học");
        listTringDo.add("Sau Đại Học");
    }
    static {
        listViTri.add("Lễ tân");
        listViTri.add("Phục vụ");
        listViTri.add("Chuyên viên");
        listViTri.add("Giám sát");
        listViTri.add("Quản lý");
        listViTri.add("Giám đốc");
    }

    public Employee() {
    }

    public Employee(String id, String name, String ngaySinh, String gioiTinh,
                    int cmnd, int sdt, String email, String tringDo, String viTri, double luong) {
        super(id, name, ngaySinh, gioiTinh, cmnd, sdt, email);
        this.tringDo = tringDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getTringDo() {
        return tringDo;
    }

    public void setTringDo(String tringDo) {
        this.tringDo = tringDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public static ArrayList<String> getListViTri() {
        return listViTri;
    }

    public static void setListViTri(ArrayList<String> listViTri) {
        Employee.listViTri = listViTri;
    }

    public static ArrayList<String> getListTringDo() {
        return listTringDo;
    }

    public static void setListTringDo(ArrayList<String> listTringDo) {
        Employee.listTringDo = listTringDo;
    }

    @Override
    public String getInfoToString() {
        return super.getInfoToString()+","+tringDo+","+viTri+","+luong;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString()+
                "tringDo='" + tringDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }
}
