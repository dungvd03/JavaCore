package Qlsv;

import java.util.Scanner;

public class QLSV {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SinhVien sinhVien = new SinhVien();

        int choose;

        do {
            System.out.println("========================== MENU =========================");
            System.out.println("1.Hien thi thong tin sinh vien.");
            System.out.println("2.Sua thong tin sinh vien.");
            System.out.println("3.Tim va sua hoc phan.");
            System.out.println("0.Exit");
            System.out.println("Moi ban nhap: ");

            try {
                choose = sc.nextInt();
            } catch (Exception e) {
                System.out.println("khong phai la so");
                return;
            }

            switch (choose) {
                case 1:
                    sinhVien.nhap();
                    sinhVien.show();
                    break;
                case 2:
                    sinhVien.edit();
                    sinhVien.show();
                    break;
                case 3:
                    sinhVien.suaHocPhan();
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
                    break;
            }

        } while (choose != 0);
    }
}
