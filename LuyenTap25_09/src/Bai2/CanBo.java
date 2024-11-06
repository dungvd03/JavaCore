package Bai2;

import java.util.Scanner;

public class CanBo extends NhanSu {
    private Phong phong;
    private String chucVu;
    private int heSoLuong;
    private String xepLoai;
    private double luong;

    public CanBo() {
        phong = new Phong();
    }

    public CanBo(int maNS, String hoDem, String ten, String gioiTinh, Phong phong, String chucVu, int heSoLuong, String xepLoai, double luong) {
        super(maNS, hoDem, ten, gioiTinh);
        this.phong = phong;
        this.chucVu = chucVu;
        this.heSoLuong = heSoLuong;
        this.xepLoai = xepLoai;
        this.luong = luong;
    }



    public void nhap() {
        super.nhap();
        phong.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuc vu: ");
        chucVu = sc.nextLine();
        System.out.print("Nhap he so luong: ");
        heSoLuong = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap xep loai (A/B/C): ");
        xepLoai = sc.nextLine();
    }

    public void xuat(){
        super.xuat();
        phong.xuat();
        System.out.println("Chuc vu: " + chucVu + ", He so luong: " + heSoLuong + ", Xep loai: " + xepLoai + ", Luong: " + luong);
    }

    public double tinhLuong(){
            luong = 0;
            if (xepLoai.equals("A")) {
                luong = heSoLuong * 150000 + 1000000;
            } else if (xepLoai.equals("B")) {
                luong = heSoLuong * 150000;
            } else if (xepLoai.equals("C")) {
                luong = heSoLuong * 150000 - 400000;
            }
            else {
                luong = heSoLuong * 150000 - 1000000;
            }
        return 0;
    }
}
