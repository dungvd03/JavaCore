package Bai1;

import java.util.Date;
import java.util.Scanner;

public class SanPham {
    protected String maSanPham;
    protected String tenSanPham;
    protected String ngaySanXuat;
    protected int trongLuong;
    protected String mauSac;


    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, String ngaySanXuat, int trongLuong, String mauSac) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.ngaySanXuat = ngaySanXuat;
        this.trongLuong = trongLuong;
        this.mauSac = mauSac;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma san pham: ");
        maSanPham = sc.nextLine();
        System.out.print("Nhap ten san pham: ");
        tenSanPham = sc.nextLine();
        System.out.print("Nhap ngay san xuat: ");
        ngaySanXuat = sc.nextLine();
        System.out.print("Nhap trong luong: ");
        trongLuong = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap mau sac: ");
        mauSac = sc.nextLine();
    }

    public void xuat(){
        System.out.println("Ma san pham: " + maSanPham);
        System.out.println("Ten san pham: " + tenSanPham);
        System.out.println("Ngay san xuat: " + ngaySanXuat);
        System.out.println("Trong luong: " + trongLuong + " kg");
        System.out.println("Mau sac: " + mauSac);
    }
}
