package luyentap4.Bai3;


import java.util.Scanner;

public class Hang {
    private String maHang;
    private String tenHang;
    private String donGia;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin mã hàng: ");
        maHang = sc.nextLine();
        System.out.println("Nhập thông tin tên hàng: ");
        tenHang = sc.nextLine();
        System.out.println("Nhập đơn giá: ");
        donGia = sc.nextLine();
    }

    public void xuat(){
        System.out.println("Mã hàng: " + maHang);
        System.out.println("Tên hàng: " + tenHang);
        System.out.println("Đơn giá: " + donGia);

    }
}
