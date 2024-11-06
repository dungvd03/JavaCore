package Bai2;

import java.util.Scanner;

public class XuongSX {
    private String tenXuong;
    private String quanDoc;
    private int soCongNhan;

    public XuongSX() {}

    public XuongSX(String tenXuong, String quanDoc, int soCongNhan) {
        this.tenXuong = tenXuong;
        this.quanDoc = quanDoc;
        this.soCongNhan = soCongNhan;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten xuong: ");
        this.tenXuong = sc.nextLine();
        System.out.print("Nhap ten quan doc: ");
        this.quanDoc = sc.nextLine();
        System.out.print("Nhap so cong nhan: ");
        this.soCongNhan = sc.nextInt();
    }

    public void xuat() {
        System.out.println("Xuong: " + tenXuong + ", Quan doc: " + quanDoc + ", So cong nhan: " + soCongNhan);
    }
}
