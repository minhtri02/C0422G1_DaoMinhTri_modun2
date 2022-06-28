package model;

import java.util.ArrayList;

public class Customer extends Person{
    private String loaiKhach;
    private String diaChi;

    static ArrayList<String> listLoaiKhach = new ArrayList<>();
    static {
        listLoaiKhach.add("Diamond");
        listLoaiKhach.add("Platinium");
        listLoaiKhach.add("Gold");
        listLoaiKhach.add("Silver");
        listLoaiKhach.add("Member");
    }

    public Customer() {
    }

    public Customer( String loaiKhach, String diaChi) {

        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public Customer(String id, String name, String ngaySinh, int gioiTinh, int cmnd, int sdt, String email, String loaiKhach, String diaChi) {
        super(id, name, ngaySinh, gioiTinh, cmnd, sdt, email);

        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }



    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public static ArrayList<String> getListLoaiKhach() {
        return listLoaiKhach;
    }

    public static void setListLoaiKhach(ArrayList<String> listLoaiKhach) {
        Customer.listLoaiKhach = listLoaiKhach;
    }

    @Override
    public String toString() {
        return "Customer{" +
                ", loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
