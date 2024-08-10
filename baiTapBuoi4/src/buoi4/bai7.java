package buoi4;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double x;
        double ketQua;
        System.out.print("Nhap a:");
        a = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap b:");
        b = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap x:");
        x = Double.parseDouble(sc.nextLine());
        ketQua = tinhBieuThuc(a, b, x);
        System.out.println("Ket qua cua bieu thuc la: " + ketQua);
    }
    public static double tinhBieuThuc(double a, double b, double x){
        return (a / 10 + Math.pow(a,b) - (Math.sin(Math.PI * x / 3) )/ Math.sqrt(Math.pow(a + b, 2) + 5) + Math.log(a * a + 1) - (Math.log(3)* (4 * Math.pow(x, 2 * a) + 3) / 2.55));
    }
}
