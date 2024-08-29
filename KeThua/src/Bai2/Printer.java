package Bai2;

import java.util.Scanner;

public class Printer {
    protected double trongLuong;
    protected String hangSX;
    protected int namSX;
    protected double tocDo;

    public void nhap(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap trong luong: ");
        trongLuong = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap hang san xuat: ");
        hangSX = sc.nextLine();
        System.out.println("Nhap nam san xuat: ");
        namSX = sc.nextInt();
        System.out.println("Nhap toc do: ");
        tocDo = sc.nextDouble();
    }

    public void xuat(){
        System.out.println("Trong luong: " + trongLuong + " kg");
        System.out.println("Hang san xuat: " + hangSX);
        System.out.println("Nam san xuat: " + namSX);
        System.out.println("Toc do: " + tocDo + " trang/phut");
    }

}
