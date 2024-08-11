package luyentap4.Bai1;

import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngày : ");
        day = sc.nextInt();
        System.out.print("Nhập tháng : ");
        month = sc.nextInt();
        System.out.print("Nhập năm : ");
        year = sc.nextInt();
    }

    public void xuat() {
        System.out.print(day + "/" + month + "/" + year);
    }
}
