package Bai1;

import java.util.Date;

public class SanPham {
    protected String[] maSanPham;
    protected String[] tenSanPham;
    protected String[] ngaySanXuat;
    protected int[] trongLuong;
    protected String[] mauSac;


    public SanPham() {
    }

    public SanPham(String[] maSanPham, String[] tenSanPham, String[] ngaySanXuat, int[] trongLuong, String[] mauSac) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.ngaySanXuat = ngaySanXuat;
        this.trongLuong = trongLuong;
        this.mauSac = mauSac;
    }

    public String[] getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String[] maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String[] getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String[] tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String[] getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String[] ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public int[] getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(int[] trongLuong) {
        this.trongLuong = trongLuong;
    }

    public String[] getMauSac() {
        return mauSac;
    }

    public void setMauSac(String[] mauSac) {
        this.mauSac = mauSac;
    }
}
