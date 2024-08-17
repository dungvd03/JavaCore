package Bai1;

import java.util.Scanner;

public class HangDienTu extends SanPham{
    private String congSuat;
    private String dongDienSuDung;

    public HangDienTu nhap(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ma san pham: ");
        maSanPham = sc.nextLine();
        System.out.println("Nhap ten san pham: ");
        tenSanPham = sc.nextLine();
        System.out.println("Nhap ngay san xuat: ");
        ngaySanXuat = sc.nextLine();
        System.out.println("Nhap trong luong: ");
        trongLuong = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap mau sac san pham: ");
        mauSac = sc.nextLine();
        System.out.println("Nhap cong suat san pham: ");
        congSuat = sc.nextLine();
        System.out.println("Nhap dong dien su dung: ");
        dongDienSuDung = sc.nextLine();
        return new HangDienTu(maSanPham, tenSanPham, ngaySanXuat, trongLuong, mauSac, congSuat, dongDienSuDung);
    }

    public void xuat(){
        super.xuat();
        System.out.println("Cong xuat " + congSuat);
        System.out.println("Dien ap su dung " + dongDienSuDung);
    }
    public HangDienTu() {
    }

    public HangDienTu(String maSanPham, String tenSanPham, String ngaySanXuat, int trongLuong, String mauSac, String congSuat, String dongDienSuDung) {
        super(maSanPham, tenSanPham, ngaySanXuat, trongLuong, mauSac);
        this.congSuat = congSuat;
        this.dongDienSuDung = dongDienSuDung;
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    public String getDongDienSuDung() {
        return dongDienSuDung;
    }

    public void setDongDienSuDung(String dongDienSuDung) {
        this.dongDienSuDung = dongDienSuDung;
    }
}
