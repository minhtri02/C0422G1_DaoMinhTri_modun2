package exercises_to_work.vehicle_management;

import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Scanner;

public class VehicleManagement {
    Scanner scn = new Scanner(System.in);
    ArrayList<XeTai> xeTais = new ArrayList<>();
    ArrayList<XeMay> xeMays = new ArrayList<>();
    ArrayList<Oto> otos = new ArrayList<>();

    public void hienThi(){

    }

    public void addVehicle() {

        int choose;
        System.out.println("Thêm mới phương tiện");
        System.out.println("1. Thêm xe tải\n" +
                "2. Thêm ôtô\n" +
                "3. Thêm xe máy");
        choose = Integer.parseInt(scn.nextLine());
        switch (choose) {
            case 1:
                addTruck();
                break;
            case 2:
                otos.add(addOto());
//                return otos;
                break;
            case 3:
                xeMays.add(addXeMay());
//                return xeMays;
                break;
            default:
//                return null;
                break;
        }
    }

    public void addTruck() {
//        XeTai xeTai = new XeTai();
        System.out.println("Thêm xe tải");
        System.out.println("Biển kiểm soát");
        String bienKiemSoat = scn.nextLine();
        System.out.println("Hãng sản xuất :"+listXeTai());
//        System.out.println();
        int chonHang = Integer.parseInt(scn.nextLine());
        System.out.println("Năm sản xuất");
        int nam = Integer.parseInt(scn.nextLine());
        System.out.println("Chủ sở hữu");
        String chuSoHuu = scn.nextLine();
        System.out.println("Tải trọng");
        double taiTrong = Double.parseDouble(scn.nextLine());


        String hangSanXuat = (chonHang == 1) ? listXeTai().get(0) :
                (chonHang == 2) ? listXeTai().get(1) : listXeTai().get(2);

        XeTai xeTai = new XeTai(bienKiemSoat, hangSanXuat, chuSoHuu, nam, taiTrong);
        xeTais.add(xeTai);
        System.out.println("Đã thêm thành công!");

//        return xeTai;
    }

    public Oto addOto() {
        System.out.println("Thêm xe Oto");
        System.out.println("Biển kiểm soát");
        String bienKiemSoat = scn.nextLine();
        System.out.println("Hãng sản xuất");
        System.out.println(listXeOto());
        int chonHang = scn.nextInt();
        HangSanXuat hangSanXuat = (chonHang == 1) ? listXeOto().get(0) :
                (chonHang == 2) ? listXeOto().get(1) : listXeOto().get(2);
        System.out.println("Năm sản xuất");
        int nam = scn.nextInt();
        System.out.println("Chủ sở hữu");
        String chuSoHuu = scn.nextLine();
        System.out.println("Số chỗ ngồi");
        int soCho = scn.nextInt();
        System.out.println("Kiểu xe");
        String kieuXe = scn.nextLine();

        Oto oto = new Oto(bienKiemSoat, hangSanXuat, chuSoHuu, nam, soCho, kieuXe);
        return oto;
    }

    public XeMay addXeMay() {
        System.out.println("Thêm xe Máy");
        System.out.println("Biển kiểm soát");
        String bienKiemSoat = scn.nextLine();
        System.out.println("Hãng sản xuất");
        System.out.println(listXeMay());
        int chonHang = scn.nextInt();
        HangSanXuat hangSanXuat = (chonHang == 1) ? listXeMay().get(0) :
                (chonHang == 2) ? listXeMay().get(1) : listXeMay().get(2);
        System.out.println("Năm sản xuất");
        int nam = scn.nextInt();
        System.out.println("Chủ sở hữu");
        String chuSoHuu = scn.nextLine();
        System.out.println("Công xuất");
        double congSuat = scn.nextDouble();

        XeMay xeMay = new XeMay(bienKiemSoat, hangSanXuat, chuSoHuu, nam, congSuat);
        return xeMay;
    }

    public ArrayList<String> listXeTai() {
        HangSanXuat xetai1 = new HangSanXuat("HN001", "HINO", "VN");
        HangSanXuat xetai2 = new HangSanXuat("HD002", "HYUNDAI", "VN");
        HangSanXuat xetai3 = new HangSanXuat("TC003", "THACO", "VN");
        ArrayList<String> listHangXeTai = new ArrayList<>();
        listHangXeTai.add(xetai1.toString());
        listHangXeTai.add(xetai2.toString());
        listHangXeTai.add(xetai3.toString());
        return listHangXeTai;
    }

    public ArrayList<HangSanXuat> listXeOto() {
        HangSanXuat oto1 = new HangSanXuat("HD001", "HONDA", "VN");
        HangSanXuat oto2 = new HangSanXuat("TYT002", "TOYOTA", "VN");
        HangSanXuat oto3 = new HangSanXuat("KIA003", "KIA", "VN");
        ArrayList<HangSanXuat> listHangSXXeOto = new ArrayList<>();
        listHangSXXeOto.add(oto1);
        listHangSXXeOto.add(oto2);
        listHangSXXeOto.add(oto3);
        return listHangSXXeOto;
    }

    public ArrayList<HangSanXuat> listXeMay() {
        HangSanXuat xemay1 = new HangSanXuat("YMH01", "YAMAHA", "VN");
        HangSanXuat xemay2 = new HangSanXuat("DCT02", "DUCATI", "VN");
        HangSanXuat xemay3 = new HangSanXuat("SZK03", "SUZUKI", "VN");
        ArrayList<HangSanXuat> listHangXeMay = new ArrayList<>();
        listHangXeMay.add(xemay1);
        listHangXeMay.add(xemay2);
        listHangXeMay.add(xemay3);
        return listHangXeMay;
    }
}
