package buoi4;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dayLon;
        double dayNho;
        double chieuCao;
        double dienTich;
        System.out.print("Nhap vao day lon cua hinh thang: ");
        dayLon = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap vao day nho cua hinh thang: ");
        dayNho = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap vao chieu cao cua hinh thang: ");
        chieuCao = Double.parseDouble(sc.nextLine());
        dienTich = tinh_Dien_Tich(dayLon, dayNho, chieuCao);
        System.out.println("Dien tich hinh thang la :" + dienTich);
    }
     public static double tinh_Dien_Tich(double a, double b, double h){
         return ((a + b) * h) / 2;
    }
}
