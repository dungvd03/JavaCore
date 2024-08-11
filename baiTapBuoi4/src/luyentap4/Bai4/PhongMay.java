package luyentap4.Bai4;

import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private Float dienTich;
    private QuanLy x;
    private May y[];
    private int n;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin");
        System.out.println("Nhập mã phòng: ");
        maPhong = sc.nextLine();
        System.out.println("Nhập tên phòng: ");
        tenPhong = sc.nextLine();
        System.out.println("Nhập diện tích: ");
        dienTich = sc.nextFloat();
        x = new QuanLy();
        x.nhap();
        System.out.println("Nhập số lượng máy: ");
        n = sc.nextInt();
        y = new May[n];
        for (int i = 0; i < n; i++) {
            y[i] = new May();
            System.out.println("Nhập máy thứ " + (i + 1) + ": ");
            y[i].nhap();
        }
    }

    public void xuat(){
        System.out.println("Thông tin vừa nhập");
        System.out.println("Mã phòng: " + maPhong);
        System.out.println("Tên phòng: " + tenPhong);
        System.out.println("Diện tích: " + dienTich);
        x.xuat();
        for (int i = 0; i < n; i++) {
            System.out.println("------------------------------");
            System.out.println("Máy thứ " + (i + 1) + ": ");
            y[i].xuat();
        }
    }
}
