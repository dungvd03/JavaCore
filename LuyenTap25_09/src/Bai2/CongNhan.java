package Bai2;

import java.util.Scanner;

public class CongNhan extends NhanSu{
    private XuongSX xuongSX;
    private String congViec;
    private int soNgayCong;
    private double luong;

    public CongNhan() {
        xuongSX = new XuongSX();
    }

    public CongNhan(int maNS, String hoDem, String ten, String gioiTinh, XuongSX xuongSX, String congViec, int soNgayCong, double luong) {
        super(maNS, hoDem, ten, gioiTinh);
        this.xuongSX = xuongSX;
        this.congViec = congViec;
        this.soNgayCong = soNgayCong;
        this.luong = luong;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        xuongSX.nhap();
        System.out.println("Nhap cong viec: ");
        congViec = sc.nextLine();
        System.out.println("Nhap so ngay cong: ");
        soNgayCong = sc.nextInt();

    }

    public void xuat(){
        super.xuat();
        xuongSX.xuat();
        System.out.println("Cong viec: " + congViec + "So ngay cong: " + soNgayCong + "Luong: " + luong);
    }

    public double tinhLuong(){
        if (soNgayCong >= 23) {
            luong = soNgayCong * 250000 + 500000;
        } else if (soNgayCong >= 20){
            luong = soNgayCong * 250000 + 300000;
        } else if (soNgayCong >= 18) {
            luong = soNgayCong * 250000;
        }
        else {
            luong = soNgayCong * 250000 - 1000000;
        }
        return luong;
    }
}
