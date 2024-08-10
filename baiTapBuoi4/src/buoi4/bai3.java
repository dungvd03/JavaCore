package buoi4;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double banKinh;
        double chuVi;
        double dienTich;
        System.out.print("Nhap ban kinh: ");
        banKinh = Double.parseDouble(sc.nextLine());
        chuVi = tinhChuVi(banKinh);
        System.out.println("Chu vi hinh tron la: " + chuVi);
        dienTich = tinhDienTich(banKinh);
        System.out.print("Dien tich hinh tron la: " + dienTich);
    }
    public static double tinhChuVi(double banKinh){
        return 2 * Math.PI * banKinh;
    }
    public static double tinhDienTich(double banKinh) {
        return Math.PI * banKinh * banKinh;
    }


}
