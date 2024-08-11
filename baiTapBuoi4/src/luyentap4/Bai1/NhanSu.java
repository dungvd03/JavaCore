package luyentap4.Bai1;

import luyentap4.Bai1.Date;

import java.util.Scanner;

public class NhanSu {
    private String maNhanSu;
    private String hoTen;
    private Date NS;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập thông tin nhân sự: ");
        System.out.print("Nhập mã nhân sự : ");
        maNhanSu = sc.nextLine();
        System.out.print("Nhập họ tên nhân sự : ");
        hoTen = sc.nextLine();
        System.out.println("Nhập ngày sinh ");
        NS = new Date();
        NS.nhap();
    }

    public void xuat() {
        System.out.println("--------------THÔNG TIN VỪA NHẬP-------------");
        System.out.println("Mã nhân sự : " + maNhanSu);
        System.out.println("Họ tên nhân sự : " + hoTen);
        System.out.print("Ngày sinh : ");
        NS.xuat();
    }
}
