package Bai1;

import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngày: ");
        this.day = sc.nextInt();
        System.out.print("Nhập tháng: ");
        this.month = sc.nextInt();
        System.out.print("Nhập năm: ");
        this.year = sc.nextInt();
    }

    public void xuat() {
        System.out.printf("%02d/%02d/%04d", day, month, year);
    }
}
