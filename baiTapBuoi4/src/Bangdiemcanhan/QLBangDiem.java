package Bangdiemcanhan;

import java.util.Scanner;

public class QLBangDiem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BangDiem bangDiem = new BangDiem();
        bangDiem.nhapBangDiem();

        int choose;
        do {
            System.out.println("-------------------- MENU --------------------");
            System.out.println("1.Hiển thị bảng điểm sinh viên");
            System.out.println("2.Hiển thị danh sách học phần có điểm dưới \"6\".");
            System.out.println("3.Chọn và sửa thông tin về sinh viên");
            System.out.println("4.Chọn và sửa thông tin học phần của sinh viên");
            System.out.println("0.Thoát !!!");
            System.out.println("Mời bạn nhập lựa chọn : ");
            try {
                choose = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Nhập không phải số!");
                return;
            }
            switch (choose) {
                case 1:
                    bangDiem.showBangDiem();
                    break;
                case 2:
                    bangDiem.showDiemDuoi(6);
                    break;
                case 3:
                    bangDiem.edit();
                    break;
                case 4:
                    bangDiem.suaHocPhan();
                    break;
                case 0:
                    System.out.println("Thoát !!!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ !!!");
                    break;
            }

        } while (choose != 0);
    }

}
