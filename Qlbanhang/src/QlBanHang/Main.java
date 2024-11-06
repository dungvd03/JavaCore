
package QlBanHang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<LoaiHang> loaiHangs = new ArrayList<>();
        ArrayList<Hang> hangs = new ArrayList<>();
        ArrayList<KhachHang> khachHangs = new ArrayList<>();
        ArrayList<GioHang> gioHangs = new ArrayList<>();


        loaiHangs.add(new LoaiHang(1, "Dien Tu"));
        loaiHangs.add(new LoaiHang(2, "Gia Dung"));
        loaiHangs.add(new LoaiHang(3, "Do An"));

        hangs.add(new Hang(1, 1, "TU lanh", 11, 700));
        hangs.add(new Hang(2, 2, "Quat Dien", 13, 800));
        hangs.add(new Hang(3, 3, "Com Suon", 15, 20));

        khachHangs.add(new KhachHang(1, "Vu Duc Dung", 1));
        khachHangs.add(new KhachHang(2, "Anh Truong", 2));
        khachHangs.add(new KhachHang(3, "Vu Van Dung", 3));

        gioHangs.add(new GioHang(1, "Tu lanh", 1));
        gioHangs.add(new GioHang(2, "Quat Dien", 2));
        gioHangs.add(new GioHang(3, "Com Suon", 3));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=================== MENU========================");
            System.out.println("1. Hiển thị danh sách loại hàng");
            System.out.println("2. Hiển thị danh sách hàng");
            System.out.println("3. Hiển thị danh sách khách hàng");
            System.out.println("4. Hiển thị danh sách khách mua hàng");
            System.out.println("5. Hiển thị giỏ hàng");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hienThiDanhSachLoaiHang(loaiHangs);
                    break;
                case 2:
                    hienThiDanhSachHang(hangs);
                    break;
                case 3:
                    hienThiDanhSachKhachHang(khachHangs);
                    break;
                case 4:
                    hienThiDanhSachKhachMuaHang(khachHangs,gioHangs);
                    break;
                case 5:
                    hienThiGioHang(gioHangs);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 0);

        scanner.close();
    }

    public static void hienThiDanhSachLoaiHang(ArrayList<LoaiHang> loaiHangs) {
        System.out.println("==========Danh sách loại hàng:==========");
        for (LoaiHang loaiHang : loaiHangs) {
            System.out.println("ID: " + loaiHang.getId() + ", Tên Loại Hàng: " + loaiHang.getTenLoai());
        }
    }


    public static void hienThiDanhSachHang(ArrayList<Hang> hangs) {
        System.out.println("==========Danh sách hàng:==========");
        for (Hang hang : hangs) {
            System.out.println("ID: " + hang.getId() + ", Loại Hàng ID: " + hang.getLoaiHangID() +
                    ", Tên Hàng: " + hang.getTenHang() + ", Số Lượng: " + hang.getSoLuong() + ", Đơn Giá: " + hang.getDonGia());
        }
    }


    public static void hienThiDanhSachKhachHang(ArrayList<KhachHang> khachHangs) {
        System.out.println("==========Danh sách khách hàng:==========");
        for (KhachHang khachHang : khachHangs) {
            System.out.println("ID: " + khachHang.getId() + ", Tên Khách Hàng: " + khachHang.getTenKhachHang()
                    + ", Loại Hàng ID: " + khachHang.getLoaiHangID());
        }
    }


    public static void hienThiGioHang(ArrayList<GioHang> gioHangs) {
        System.out.println("==========Danh sách giỏ hàng:==========");
        for (GioHang gioHang : gioHangs) {
            System.out.println("ID: " + gioHang.getId() + ", Tên Hàng: " + gioHang.getTenHang() +
                    ", Loại Hàng ID: " + gioHang.getLoaiHangID());
        }
    }
    public static void hienThiDanhSachKhachMuaHang(ArrayList<KhachHang> khachHangs, ArrayList<GioHang> gioHangs) {
        System.out.println("==========Danh sách khách mua hàng:==========");
        for (KhachHang khachHang : khachHangs) {
            System.out.println("Khách hàng: " + khachHang.getTenKhachHang());
            System.out.println("Các mặt hàng đã mua:");
            boolean hasItems = false;

            for (GioHang gioHang : gioHangs) {
                if (gioHang.getLoaiHangID() == khachHang.getId()) {
                    System.out.println(gioHang.getTenHang());
                    hasItems = true;
                    if (!hasItems) {
                        System.out.println(" - Không có sản phẩm nào.");
                    }
                    System.out.println();
                }
            }
        }
    }
}
