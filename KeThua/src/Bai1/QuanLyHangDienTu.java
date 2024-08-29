package Bai1;


import java.util.Scanner;

public class QuanLyHangDienTu {

    public static void main(String[] args) {
        HangDienTu hangDienTu = new HangDienTu();

        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("---------------------------------------Menu---------------------------------------------");
            System.out.println("1.Nhap danh sach.");
            System.out.println("2.Hien thi thong tin.");
            System.out.println("3.In ra mat hang co trong luong thap nhat.");
            System.out.println("0.Thoat.");
            System.out.println("Chon: ");
            try {
                choice = sc.nextInt();
            }catch (Exception e){
                System.out.println("Nhap khong phai so!!");
                return;
            }
            switch (choice){
                case 1:
                    hangDienTu.nhap();
                    break;
                case 2:
                    hangDienTu.xuat();
                    break;
                case 3:
                    hangDienTu.matHangMin();
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

}
