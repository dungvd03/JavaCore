package luyentap4.Bai3;

import java.util.Scanner;

public class Phieu {
    private String maPhieu;
    private Hang x[];
    private int n;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin phiếu");
        System.out.println("Nhập thông tin mã phiếu: ");
        maPhieu = sc.nextLine();
        System.out.println("Nhap so luong hang: ");
        n = sc.nextInt();
        x = new Hang[n];

        for (int i = 0; i < n; i++) {
            x[i] = new Hang();
            System.out.println("------------------------------");
            System.out.println("Ma hang thu " + (i + 1) + ": ");
            x[i].nhap();
        }
    }

    public void xuat(){
        System.out.println("Thông tin vừa nhập là");
        System.out.println("Mã phiếu: " + maPhieu);
        for (int i = 0; i < n; i++) {
            System.out.println("Hang thu " + (i + 1));
            x[i].xuat();
        }
    }
}
