package luyentap4.bai2;

import java.util.Scanner;

public class Hang {
    private String maHang;
    private String tenHang;
    private NSX x;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập thông tin: ");
        System.out.println("Nhập thông tin mã hàng: ");
        maHang = sc.nextLine();
        System.out.println("Nhập thông tin tên hàng: ");
        tenHang = sc.nextLine();
        System.out.println("Nhập thông tin NSX: ");
        x = new NSX();
        x.nhap();
    }

    public void xuat(){
        System.out.println("Thông tin bạn vừa nhập là: ");
        System.out.println("Mã hàng: " + maHang);
        System.out.println("Tên hàng: " + tenHang);
        x.xuat();
    }
}
