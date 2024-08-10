package buoi4;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int a;
        a = nhapSo();
        hienThiSo(a);
    }
    public static int nhapSo(){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Nhap a: ");
        a = Integer.parseInt(sc.nextLine());
        return a;
    }
    public static void hienThiSo(int a){
        System.out.println("So vua nhap la: " + a);
    }
}
