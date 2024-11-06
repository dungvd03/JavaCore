package Bai2;

import java.util.Scanner;

public class Phong {
    private String tenPhong;
    private String truongPhong;

    public Phong() {
    }

    public Phong(String tenPhong, String truongPhong) {
        this.tenPhong = tenPhong;
        this.truongPhong = truongPhong;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten phong: ");
        this.tenPhong = sc.nextLine();
        sc.nextLine();
        System.out.print("Nhap truong phong: ");
        this.truongPhong = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ten phong: " + tenPhong + ", Truong phong: " + truongPhong);
    }
}
