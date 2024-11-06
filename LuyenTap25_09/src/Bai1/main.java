package Bai1;

import Bai2.NhanSu;

import java.util.Scanner;

public class main {

    public static Teacher[] danhSachGiaoVien;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Teacher teacher1 = new Teacher(1,"Vu","Dung",
                new Date(07,12,2003),4,
                new Subject(1,"Toan"),3,34,1200000);
        addGV(teacher1);



        int luaChon;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Nhập danh sách giáo viên");
            System.out.println("2. Hiển thị danh sách giáo viên");
            System.out.println("3. Hiển thị giáo viên có lương thấp hơn 5 triệu");
            System.out.println("4. Thêm giáo viên vào vị trí k");
            System.out.println("5. Tính tổng lương của tất cả giáo viên");
            System.out.println("6. Chuyển giáo viên không có giờ dạy xuống cuối danh sách");
            System.out.println("7. Sắp xếp danh sách theo tên tăng dần");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            luaChon = sc.nextInt();

            switch (luaChon) {
                case 1:
                    System.out.print("Nhập số lượng giáo viên: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        Teacher gv = new Teacher();
                        gv.nhap();
                        gv.calcuSalary();
                        addGV(gv);
                    }
                    break;
                case 2:
                    hienThiDanhSachGiaoVien();
                    break;
                case 3:
                    hienThiGiaoVienLuongThap();
                    break;
                case 4:
                    themGiaoVienVaoViTriK(sc);
                    break;
                case 5:
                    tinhTongLuong();
                    break;
                case 6:
                    chuyenGiaoVienKhongGioDay();
                    break;
                case 7:
                    sapXepGiaoVienTheoTen();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Chọn không hợp lệ.");
            }
        } while (luaChon != 0);
    }

    private static void addGV(Teacher teacherNew) {
        if (danhSachGiaoVien == null) {
            danhSachGiaoVien = new Teacher[1];
            danhSachGiaoVien[0] = teacherNew;
        } else {
            Teacher[] tmp = danhSachGiaoVien.clone();
            danhSachGiaoVien = new Teacher[tmp.length + 1];
            for (int i = 0; i < tmp.length; i++) {
                danhSachGiaoVien[i] = tmp[i];
            }
            danhSachGiaoVien[tmp.length] = teacherNew;
        }
    }

    private static void hienThiDanhSachGiaoVien() {
        if (danhSachGiaoVien != null) {
            for (Teacher gv : danhSachGiaoVien) {
                gv.xuat();
            }
        } else {
            System.out.println("Danh sach giao vien trong.");
        }
    }

    public static void hienThiGiaoVienLuongThap() {
        for (Teacher gv : danhSachGiaoVien) {
            if (gv.getSalary() < 5000000) {
                gv.xuat();
            }
        }
    }

    public static void themGiaoVienVaoViTriK(Scanner sc){
        System.out.println("Nhap vi tri K: ");
        int k = sc.nextInt();
        if( k < 0 || k > danhSachGiaoVien.length){
            System.out.println("Vị trí không hợp lệ.");
            return;
        }
        Teacher gv = new Teacher();
        gv.nhap();
        gv.calcuSalary();

        Teacher[] tmp = new Teacher[danhSachGiaoVien.length + 1];
        for (int i = 0; i < k; i++) {
            tmp[i] = danhSachGiaoVien[i];
        }
        tmp[k] = gv;
        for (int i = k; i < danhSachGiaoVien.length; i++) {
            tmp[i+1]= danhSachGiaoVien[i];
        }
        danhSachGiaoVien=tmp;
    }

    public static void tinhTongLuong(){
        double tong = 0;
        for (Teacher gv : danhSachGiaoVien){
            tong += gv.getSalary();
        }
        System.out.println("Tổng lương của tất cả giáo viên: " + tong);
    }

    public static void chuyenGiaoVienKhongGioDay(){

    }

    public static void sapXepGiaoVienTheoTen(){

    }


}
