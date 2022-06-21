package model;

public class SanPham implements Comparable<SanPham> {
    private int id;
    private String tenSanPham;
    private double giaSanPham;

    public SanPham() {
    }

    public SanPham(int id, String tenSanPham, double giaSanPham) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.giaSanPham = giaSanPham;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(double giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "id=" + id +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", giaSanPham=" + giaSanPham +
                '}';
    }



    @Override
    public int compareTo(SanPham o) {
        if (this.giaSanPham >o.giaSanPham){
            return 1;
        }else
        return -1;
    }
}
