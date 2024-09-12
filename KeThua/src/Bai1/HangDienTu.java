package Bai1;

import java.util.Scanner;

class HangDienTu extends SanPham{
    private int congSuat;
    private int dongDien;

    public HangDienTu() {
    }

    public HangDienTu(String maSanPham, String tenSanPham, String ngaySanXuat, int trongLuong, String mauSac, int congSuat, int dongDien) {
        super(maSanPham, tenSanPham, ngaySanXuat, trongLuong, mauSac);
        this.congSuat = congSuat;
        this.dongDien = dongDien;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);

        super.nhap();
        System.out.print("Nhap cong suat: ");
        congSuat = sc.nextInt();
        System.out.print("Nhap dong dien su dung (1: 1 chieu, 2: 2 chieu): ");
        dongDien = sc.nextInt();


    }

    public void xuat(int stt){
        super.xuat();
        System.out.println("Cong suat: " + congSuat + " W");
        System.out.println("Dong dien su dung: " + (dongDien == 1 ? "1 chieu" : "2 chieu"));

    }

    public void matHangMin(){


    }

}
