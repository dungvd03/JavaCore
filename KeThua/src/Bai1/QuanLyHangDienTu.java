package Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyHangDienTu {

    static List<HangDienTu> danhSachHangDienTu = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static HangDienTu hangDienTu = new HangDienTu();
    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("--------------------------------------Menu---------------------------------------------");
            System.out.println("1.Nhap danh sach.");
            System.out.println("2.Hien thi thong tin.");
            System.out.println("3.In ra mat hang co trong luong thap nhat.");
            System.out.println("0.IThoat.");
            System.out.println("Chon: ");
            try {
                choice = sc.nextInt();
            }catch (Exception e){
                System.out.println("Nhap khong phai so!!");
                return;
            }
            switch (choice){
                case 1:
                    nhapDanhSach();
                    break;
                case 2:
                    xuatDanhSach();
                    break;
                case 3:
                    matHangMin();
                    break;
                case 0:
                    System.out.println("Da thoat...");
                    return;
                default:
                    System.out.println("Lua chon khong hop le");
                    break;
            }


        }while (choice!=0);

    }

    public static void nhapDanhSach(){

        System.out.println("Nhap so luong hang dien tu: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho hang dien tu thu " + (i + 1) + " ");
            hangDienTu.nhap();
            danhSachHangDienTu.add(hangDienTu);
        }
    }

    public static void xuatDanhSach(){
        System.out.println("-----------------------Danh Sach Hang Dien Tu----------------------------");
        for (HangDienTu hangDienTu : danhSachHangDienTu) {
            hangDienTu.xuat();
        }
    }

    public static void matHangMin(){

    }
}
