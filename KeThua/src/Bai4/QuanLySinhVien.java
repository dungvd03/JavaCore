package Bai4;



import java.util.Scanner;

class SinhVien {
    String maSV;
    String hoDem;
    String ten;
    int namSinh;
    String gioiTinh;
}

class MonHoc{
    String maMon;
    String tenMon;
    float heSo;
}

class Diem {
    String maSV;
    String maMon;
    float diemSo;
}

public class QuanLySinhVien{
    static SinhVien[] danhSachSV = new SinhVien[20];
    static MonHoc[] danhSachMH = new MonHoc[20];
    Diem[] danhSachDiem = new Diem[20];

    static int soLuongSV = 0;
    static int soLuongMon = 0;
    static int soLuongDiem = 0;

    public static void main(String[] args) {
        QuanLySinhVien ql = new QuanLySinhVien();
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("===== MENU QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa thông tin sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Hiển thị danh sách sinh viên");
            System.out.println("5. Thêm môn học");
            System.out.println("6. Sửa thông tin môn học");
            System.out.println("7. Xóa môn học");
            System.out.println("8. Hiển thị danh sách môn học");
            System.out.println("9. Hiển thị bảng điểm theo sinh viên");
            System.out.println("10. Hiển thị bảng điểm theo môn học");
            System.out.println("11. Tìm kiếm sinh viên theo mã");
            System.out.println("12. Tìm kiếm môn học theo mã");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();
            scanner.nextLine();

            switch (luaChon) {
                case 1:
                    SinhVien sv = new SinhVien();
                    System.out.print("Nhập mã sinh viên: ");
                    sv.maSV = scanner.nextLine();
                    System.out.print("Nhập họ đệm: ");
                    sv.hoDem = scanner.nextLine();
                    System.out.print("Nhập tên: ");
                    sv.ten = scanner.nextLine();
                    System.out.print("Nhập năm sinh: ");
                    sv.namSinh = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập giới tính: ");
                    sv.gioiTinh = scanner.nextLine();
                    ql.themSinhVien(sv);
                    break;

                case 2:
                    System.out.print("Nhập mã sinh viên cần sửa: ");
                    String maSVSua = scanner.nextLine();
                    SinhVien svMoi = new SinhVien();
                    System.out.print("Nhập họ đệm mới: ");
                    svMoi.hoDem = scanner.nextLine();
                    System.out.print("Nhập tên mới: ");
                    svMoi.ten = scanner.nextLine();
                    System.out.print("Nhập năm sinh mới: ");
                    svMoi.namSinh = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập giới tính mới: ");
                    svMoi.gioiTinh = scanner.nextLine();
                    ql.suaSinhVien(maSVSua, svMoi);
                    break;

                case 3:
                    System.out.print("Nhập mã sinh viên cần xóa: ");
                    String maSVXoa = scanner.nextLine();
                    ql.xoaSinhVien(maSVXoa);
                    break;

                case 4:
                    ql.hienThiDanhSachSV();
                    break;

                case 5:
                    MonHoc mh = new MonHoc();
                    System.out.print("Nhập mã môn học: ");
                    mh.maMon  = scanner.nextLine();

                    System.out.print("Nhập tên môn học: ");
                    mh.tenMon = scanner.nextLine();
                    System.out.print("Nhập hệ số môn học: ");
                    mh.heSo = scanner.nextFloat();
                    ql.themMonHoc(mh);
                    break;

                case 6:
                    System.out.print("Nhập mã môn học cần sửa: ");
                    String maMHSua= scanner.nextLine();
                    MonHoc mhMoi = new MonHoc();
                    System.out.print("Nhập tên môn học cần sửa: ");
                    mhMoi.tenMon = scanner.nextLine();
                    System.out.print("Nhập hệ số môn học cần sửa: ");
                    mhMoi.heSo = scanner.nextFloat();
                    ql.suaMonHoc(maMHSua, mhMoi);
                    break;

                case 7:
                    System.out.print("Nhập mã sinh viên cần xóa: ");
                    String maMHXoa = scanner.nextLine();
                    ql.xoaMonHoc(maMHXoa);
                    break;

                case 8:
                    ql.hienThiDanhSachMH();
                    break;

                case 9:

                    break;

                case 10:

                    break;

                case 11:

                    break;

                case 12:

                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
                    break;
            }
        } while (luaChon != 0);

        scanner.close();
    }

    public static void themSinhVien(SinhVien sv){
        if(kiemTraMaSV(sv.maSV) == -1){
            danhSachSV[soLuongSV++] = sv;
        }
        else {
            System.out.println("Ma sinh vien da ton tai!!!");
        }
    }

    private static int kiemTraMaSV(String maSV) {
        for (int i = 0; i < soLuongSV; i++) {
            if (danhSachSV[i].maSV.equals(maSV)) {
                return i;
            }
        }
        return -1;
    }

    public void suaSinhVien(String maSV, SinhVien svMoi) {
        int viTri = kiemTraMaSV(maSV);
        if (viTri != -1) {
            danhSachSV[viTri] = svMoi;
        } else {
            System.out.println("Không tìm thấy sinh viên với mã " + maSV);
        }
    }

    public void xoaSinhVien(String maSV) {
        int viTri = kiemTraMaSV(maSV);
        if (viTri != -1) {
            for (int i = viTri; i < soLuongSV - 1; i++) {
                danhSachSV[i] = danhSachSV[i + 1];
            }
            soLuongSV--;
        } else {
            System.out.println("Không tìm thấy sinh viên với mã " + maSV);
        }
    }

    public void hienThiDanhSachSV() {
        System.out.println("-----------------------------Danh Sach Sinh Vien-----------------------------");
        for (int i = 0; i < soLuongSV; i++) {
            System.out.println("Mã SV: " + danhSachSV[i].maSV + " - Tên: " + danhSachSV[i].hoDem + " " + danhSachSV[i].ten);
        }
    }

    public static void themMonHoc(MonHoc mh){
        if(kiemTraMaMH(mh.maMon) == -1){
            danhSachMH[soLuongMon++] = mh;
        }
        else {
            System.out.println("Mon hoc da ton tai!!!");
        }
    }

    private static int kiemTraMaMH(String maMH) {
        for (int i = 0; i < soLuongMon; i++) {
            if (danhSachMH[i].maMon.equals(maMH)) {
                return i;
            }
        }
        return -1;
    }

    public void suaMonHoc(String maMH, MonHoc mhMoi) {
        int viTri = kiemTraMaSV(maMH);
        if (viTri != -1) {
            danhSachMH[viTri] = mhMoi;
        } else {
            System.out.println("Không tìm thấy sinh viên với mã " + maMH);
        }
    }

    public void xoaMonHoc(String maMH) {
        int viTri = kiemTraMaSV(maMH);
        if (viTri != -1) {
            for (int i = viTri; i < soLuongSV - 1; i++) {
                danhSachSV[i] = danhSachSV[i + 1];
            }
            soLuongSV--;
        } else {
            System.out.println("Không tìm thấy sinh viên với mã " + maMH);
        }
    }

    public void hienThiDanhSachMH() {
        System.out.println("-----------------------------Danh Sach Mon Hoc-----------------------------");
        for (int i = 0; i < soLuongMon; i++) {
            System.out.println("Mã MH: " + danhSachMH[i].maMon + " - Tên MH: " + danhSachMH[i].tenMon + " He so " + danhSachMH[i].heSo);
        }
    }

    public void themDiem(){}

}
