package Bai2;

import java.util.Scanner;

public class NhanSu {
    private int maNS;
    private String hoDem;
    private String ten;
    private String gioiTinh;

    public NhanSu() {}

    public NhanSu(int maNS, String hoDem, String ten, String gioiTinh) {
        this.maNS = maNS;
        this.hoDem = hoDem;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
    }

    public int getMaNS() {
        return maNS;
    }

    public void setMaNS(int maNS) {
        this.maNS = maNS;
    }

    public String getHoDem() {
        return hoDem;
    }

    public void setHoDem(String hoDem) {
        this.hoDem = hoDem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân sự: ");
        this.maNS = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập họ đệm: ");
        this.hoDem = sc.nextLine();
        System.out.print("Nhập tên: ");
        this.ten = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        this.gioiTinh = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Mã nhân sự: " + maNS + ", Họ và tên: " + hoDem + " " + ten + ", Giới tính: " + gioiTinh);
    }

    public double tinhLuong(){
        return 0;
    }

}
