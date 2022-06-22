package common;

import model.SanPham;

import java.util.Comparator;

public class DecreasePrice implements Comparator<SanPham> {
    @Override
    public int compare(SanPham o1, SanPham o2) {
        if (o2.getGiaSanPham() > o1.getGiaSanPham()){
            return -1;
        }else
        return 1;
    }
}
