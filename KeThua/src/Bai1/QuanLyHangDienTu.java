package Bai1;


import java.util.Scanner;

public class QuanLyHangDienTu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập số lượng hàng điện tử : ");
        n = sc.nextInt();

        HangDienTu[] hangDienTu = new HangDienTu[n];
        int choose = 0;
        System.out.println("============================ NHẬP THÔNG TIN HÀNG ĐIỆN TỬ =================================");
        for (int i = 0; i < n; i++) {
            System.out.println("Sản phẩm thứ " + (i + 1));
            hangDienTu[i] = new HangDienTu();
            hangDienTu[i].nhap();
        }

        do {
            System.out.println("========================= MENU ==========================");
            System.out.println("1.Hiển thị danh sách hàng điện tử");
            System.out.println("2.Hiển thị danh sách hàng điện tử có trọng lượng thấp nhất");
            System.out.println("0.Thoát !!!");
            System.out.println("Mời bạn nhập lựa chọn : ");

            try {
                choose = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Nhập không phải số !!!");
            }

            switch (choose) {
                case 1:
                    showDanhSach(hangDienTu);
                    break;
                case 2:
                    matHangMin(hangDienTu);
                    break;
                case 0:
                    System.out.println("Thoát !!!");
                    break;
                default:
                    System.out.println("Mời bạn nhập lại !!!");
                    break;
            }
        } while (choose != 0);

    }

    protected static void showDanhSach(HangDienTu[] hangDienTu) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=================================== DANH SÁCH HÀNG ĐIỆN TỬ ========================================");
        for (int i = 0; i < hangDienTu.length; i++) {
            hangDienTu[i].xuat(i + 1);
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Nhấn ENTER tiếp tục ...");
        sc.nextLine();

    }

    protected static void matHangMin(HangDienTu[] hangDienTu) {

        Scanner sc = new Scanner(System.in);

        float min = hangDienTu[0].trongLuong;

        for (int i = 0; i < hangDienTu.length; i++) {

            min = Math.min(min, hangDienTu[i].trongLuong);

        }

        System.out.println("======================== DANH SÁCH MẶT HÀNG CÓ TRỌNG LƯỢNG THẤP NHẤT ========================");
        int stt = 1;
        for (int i = 0; i < hangDienTu.length; i++) {
            if (min == hangDienTu[i].trongLuong) {
                hangDienTu[i].xuat(stt);
                stt++;
            }
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Nhấn ENTER tiếp tục ...");
        sc.nextLine();
    }

}
