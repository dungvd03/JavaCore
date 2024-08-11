package luyentap4.Bai4;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class QuanLy {
    private String maQl;
    private String hoTen;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã QL: ");
        maQl = sc.nextLine();
        System.out.println("Nhập họ tên: ");
        hoTen = sc.nextLine();
    }

    public void xuat(){
        System.out.println("Mã Ql: " + maQl);
        System.out.println("Họ tên: " + hoTen);
    }
}
