package SinhVien;

import java.util.Objects;
import java.util.Scanner;

public class Main {


    public static SinhVien[] sinhViens;
    public static MonHoc[] monHocs;
    public static Diem[] diems;

    public static Scanner scanner;

    public static void main(String[] args) {

        addSinhVien(new SinhVien("SV01", "Pham", "Truong", 2000, true));
        addSinhVien(new SinhVien("SV02", "Phan", "Tu", 2001, true));
        addSinhVien(new SinhVien("SV03", "Nguyen", "Van", 1999, false));
        addSinhVien(new SinhVien("SV04", "Tran", "Anh", 2002, true));

        addMonHoc(new MonHoc("M01", "Toan", 3));
        addMonHoc(new MonHoc("M02", "Van", 3));
        addMonHoc(new MonHoc("M03", "Anh", 3));

        addBangDiem(new Diem("SV01", "M02", 5));
        addBangDiem(new Diem("SV02", "M02", 6));
        addBangDiem(new Diem("SV01", "M01", 5));
        addBangDiem(new Diem("SV03", "M03", 7));
        addBangDiem(new Diem("SV03", "M02", 5));
        addBangDiem(new Diem("SV04", "M02", 2));
        addBangDiem(new Diem("SV03", "M01", 5));

        int choose = -1;
        do {
            System.out.println("===========================================================");
            System.out.println("==================Menu==================");
            System.out.println("1.Quan ly Sinh vien");
            System.out.println("2.Quan ly Mon hoc");
            System.out.println("3.Quan ly Bang diem");
            System.out.println("4.Hien thi Bang diem");
            System.out.println("5.Tim kiem");
            System.out.println("0.Thoat");
            System.out.print("Chon:");
            scanner = new Scanner(System.in);

            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    quanLySinhVien();
                    break;
                case 2:
                    quanLyMonHoc();
                    break;
                case 3:
                    quanLyBangDien();
                    break;
                case 4:
                    hienThiBangDiem();
                    break;
                case 5:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }

        } while (choose != 0);

        System.out.println("Da thoat chuong trinh!!");

    }

    private static void hienThiSinhVienMon(String maMon) {
        System.out.println(String.format("%3s %-10s %-15s %-10s %-20s %-10s", "STT", "Ma SV", "Ho Dem", "Ten", "Ten Mon Hoc", "Diem"));
        for (int i = 0; i < diems.length; i++) {

            if (diems[i].getMaMon().equals(maMon)) {

                SinhVien sinhVien = getSinhVien(diems[i].getMaSV());
                MonHoc monHoc = getMonHoc(diems[i].getMaMon());

                System.out.println(String.format("%3d %-10s %-15s %-10s %-20s %-10.1f",
                        i + 1, diems[i].getMaSV(), sinhVien.getHoDem(), sinhVien.getTen(), monHoc.getTenMon(), diems[i].getDiem()));

            }

        }
    }

    private static void hienThiBangDiem() {

        System.out.println(String.format("%3s %-10s %-15s %-10s %-20s %-10s", "STT", "Ma SV", "Ho Dem", "Ten", "Ten Mon Hoc", "Diem"));
        for (int i = 0; i < diems.length; i++) {

            SinhVien sinhVien = getSinhVien(diems[i].getMaSV());
            MonHoc monHoc = getMonHoc(diems[i].getMaMon());

            System.out.println(String.format("%3d %-10s %-15s %-10s %-20s %-10.1f",
                    i + 1, diems[i].getMaSV(), sinhVien.getHoDem(), sinhVien.getTen(), monHoc.getTenMon(), diems[i].getDiem()));
        }

    }

    private static SinhVien getSinhVien(String maSV) {
        for (int i = 0; i < sinhViens.length; i++) {
            if (sinhViens[i].getMaSV().equals(maSV)) {
                return sinhViens[i];
            }
        }
        return null;
    }

    private static MonHoc getMonHoc(String maMon) {
        for (int i = 0; i < monHocs.length; i++) {
            if (monHocs[i].getMaMon().equals(maMon)) {
                return monHocs[i];
            }
        }
        return null;
    }

    private static void quanLySinhVien() {
        int choose = -1;
        do {
            System.out.println("=============================================");
            System.out.println("=============Quan ly Sinh vien===============");
            System.out.println("1.Them Sinh vien");
            System.out.println("2.Sua Sinh vien");
            System.out.println("3.Xoa Sinh vien");
            System.out.println("4.Hien thi Sinh vien");
            System.out.println("0.Thoat");
            System.out.print("Chon:");
            scanner = new Scanner(System.in);

            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    nhapSinhVien();
                    break;
                case 2:
                    capNhatSinhVien();
                    break;
                case 3:
                    xoaSinhVien();
                    break;
                case 4:
                    hienThiTatCaSinhVien();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }

        } while (choose != 0);
    }

    private static void quanLyMonHoc() {
        int choose = -1;
        do {
            System.out.println("=============================================");
            System.out.println("=============Quan ly mon hoc===============");
            System.out.println("1.Them mon hoc");
            System.out.println("2.Sua mon hoc");
            System.out.println("3.Xoa mon hoc");
            System.out.println("4.Hien thi mon hoc");
            System.out.println("0.Thoat");
            System.out.print("Chon:");
            scanner = new Scanner(System.in);

            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    nhapMonHoc();
                    break;
                case 2:
                    capNhatMonHoc();
                    break;
                case 3:
                    xoaMonHoc();
                    break;
                case 4:
                    hienThiTatCaMonHoc();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }

        } while (choose != 0);
    }

    private static void quanLyBangDien() {
        int choose = -1;
        do {
            System.out.println("=============================================");
            System.out.println("=============Quan ly bang diem===============");
            System.out.println("1.Them diem cho sinh vien");
            System.out.println("2.Sua diem");
            System.out.println("3.Xoa diem");
            System.out.println("4.Hien thi diem");
            System.out.println("0.Thoat");
            System.out.print("Chon:");
            scanner = new Scanner(System.in);

            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    nhapDiem();
                    break;
                case 2:
                    suaDiem();
                    break;
                case 3:
                    xoaDiem();
                    break;
                case 4:
                    hienThiBangDiem();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }

        } while (choose != 0);
    }

    //================================================Sinh vien=========================================================

    

    private static void nhapSinhVien() {
        scanner = new Scanner(System.in);

        System.out.print("Nhap ma sinh vien: ");
        String maSV = scanner.nextLine();

        System.out.print("Nhap ho dem: ");
        String hoDem = scanner.nextLine();

        System.out.print("Nhap ten: ");
        String ten = scanner.nextLine();

        System.out.print("Nhap nam sinh: ");
        int namSinh = scanner.nextInt();

        System.out.print("Nhap gioi tinh (true - Nam, false - Nu): ");
        boolean gioiTinh = scanner.nextBoolean();

        SinhVien sinhVien = new SinhVien(maSV, hoDem, ten, namSinh, gioiTinh);
        addSinhVien(sinhVien);
        System.out.println("Them sinh vien thanh cong!");
    }

    private static void hienThiTatCaSinhVien() {
        if (sinhViens == null || sinhViens.length == 0) {
            System.out.println("Danh sach sinh vien trong!");
            return;
        }

        System.out.println(String.format("%3s %-10s %-15s %-10s %-10s %-10s", "STT", "Ma SV", "Ho Dem", "Ten", "Nam Sinh", "Gioi Tinh"));
        for (int i = 0; i < sinhViens.length; i++) {

            System.out.println(String.format("%3d %-10s %-15s %-10s %-10d %-10s",
                    i + 1, sinhViens[i].getMaSV(), sinhViens[i].getHoDem(), sinhViens[i].getTen(), sinhViens[i].getNamSinh(), sinhViens[i].getGioiTinh()));
        }
    }

    private static void addSinhVien(SinhVien sinhVienNew) {
        if (sinhViens == null) {
            sinhViens = new SinhVien[1];
            sinhViens[0] = sinhVienNew;
        } else {
            SinhVien[] tmp = sinhViens.clone();
            sinhViens = new SinhVien[tmp.length + 1];
            for (int i = 0; i < tmp.length; i++) {
                sinhViens[i] = tmp[i];
            }
            sinhViens[tmp.length] = sinhVienNew;
        }
    }

    private static void capNhatSinhVien() {
        scanner.nextLine();
        System.out.println("Nhap ma sinh vien can cap nhat: ");
        String maSV = scanner.nextLine();
        SinhVien sinhVien = getSinhVien1(maSV);
        if (sinhVien == null) {
            System.out.println("Sinh vien khong ton tai!");
            return;
        }

        System.out.println("Nhap ho dem moi: ");
        String hoDem = scanner.nextLine();
        System.out.println("Nhap ten moi: ");
        String ten = scanner.nextLine();
        System.out.println("Nhap nam sinh moi: ");
        int namSinh = scanner.nextInt();
        System.out.println("Nhap gioi tinh moi (true = Nam, false = Nu): ");
        boolean gioiTinh = scanner.nextBoolean();

        SinhVien sinhVienMoi = new SinhVien(maSV, hoDem, ten, namSinh, gioiTinh);
        updateSinhVien(sinhVienMoi);
    }

    private static SinhVien getSinhVien1(String maSV) {
        for (SinhVien sv : sinhViens) {
            if (sv.getMaSV().equals(maSV)) {
                return sv;
            }
        }
        return null;
    }

    private static void updateSinhVien(SinhVien sinhVienUpdate) {
        for (int i = 0; i < sinhViens.length; i++) {
            if (Objects.equals(sinhVienUpdate.getMaSV(), sinhViens[i].getMaSV())) {
                sinhViens[i] = sinhVienUpdate;
                System.out.println("Sua thanh cong!");
                return;
            }
        }
        System.out.println("Sinh vien can sua khong ton tai!");
    }

    private static void xoaSinhVien() {
        scanner.nextLine();
        System.out.println("Nhap ma sinh vien can xoa: ");
        String maSV = scanner.nextLine();
        deleteSinhVien(maSV);
    }

    private static void deleteSinhVien(String maSV) {

        if (sinhViens.length == 0) {
            System.out.println("Danh sach sinh vien trong!");
            return;
        }

        SinhVien[] ans = null;

        for (int i = 0; i < sinhViens.length; i++) {
            if (!Objects.equals(maSV, sinhViens[i].getMaSV())) {
                if (ans == null) {
                    ans = new SinhVien[1];
                    ans[0] = sinhViens[i];
                } else {
                    SinhVien[] tmp = ans.clone();
                    ans = new SinhVien[tmp.length + 1];
                    for (int j = 0; j < tmp.length; j++) {
                        ans[j] = tmp[j];
                    }
                    ans[tmp.length] = sinhViens[i];
                }
            }
        }

        if (ans.length == sinhViens.length) {
            System.out.println("Ma sinh vien khong ton tai!");
        } else {
            sinhViens = ans.clone();
            System.out.println("Xoa sinh vien thanh cong!");
        }
    }


    //================================================Mon hoc===========================================================

    private static void nhapMonHoc() {
        scanner = new Scanner(System.in);

        System.out.print("Nhap ma mon hoc: ");
        String maMon = scanner.nextLine();

        System.out.print("Nhap ten mon hoc: ");
        String tenMon = scanner.nextLine();

        System.out.print("Nhap he so: ");
        int heSo = scanner.nextInt();

        MonHoc monHoc = new MonHoc(maMon, tenMon, heSo);
        addMonHoc(monHoc);
        System.out.println("Them mon hoc thanh cong!");
    }

    private static void hienThiTatCaMonHoc() {
        if (monHocs == null || monHocs.length == 0) {
            System.out.println("Danh sach mon hoc trong!");
            return;
        }

        System.out.println(String.format("%3s %-10s %-20s %-10s", "STT", "Ma Mon", "Ten Mon", "He so"));
        for (int i = 0; i < monHocs.length; i++) {
            System.out.println(String.format("%3d %-10s %-20s %-10d",
                    i + 1, monHocs[i].getMaMon(), monHocs[i].getTenMon(), monHocs[i].getHeSo()));
        }
    }

    private static void addMonHoc(MonHoc newData) {
        if (monHocs == null) {
            monHocs = new MonHoc[1];
            monHocs[0] = newData;
        } else {
            MonHoc[] tmp = monHocs.clone();
            monHocs = new MonHoc[tmp.length + 1];
            for (int i = 0; i < tmp.length; i++) {
                monHocs[i] = tmp[i];
            }
            monHocs[tmp.length] = newData;
        }
    }

    private static void capNhatMonHoc() {
        scanner.nextLine();
        System.out.println("Nhap ma mon hoc can cap nhat: ");
        String maMon = scanner.nextLine();
        MonHoc monHoc = getMonHoc1(maMon);
        if (monHoc == null) {
            System.out.println("Mon hoc khong ton tai!");
            return;
        }

        System.out.println("Nhap ten mon moi: ");
        String tenMon = scanner.nextLine();
        System.out.println("Nhap he so moi: ");
        int heSo = scanner.nextInt();
        MonHoc monhocmoi = new MonHoc(maMon, tenMon, heSo);
        updateMonHoc(monhocmoi);
    }

    private static MonHoc getMonHoc1(String maMH) {
        for (MonHoc mh : monHocs) {
            if (mh.getMaMon().equals(maMH)) {
                return mh;
            }
        }
        return null;
    }

    private static void updateMonHoc(MonHoc dataUpdate) {
        for (int i = 0; i < monHocs.length; i++) {
            if (Objects.equals(dataUpdate.getMaMon(), monHocs[i].getMaMon())) {
                monHocs[i] = dataUpdate;
                System.out.println("Sua thanh cong!");
                return;
            }
        }
        System.out.println("Mon hoc can sua khong ton tai!");
    }

    private static void xoaMonHoc() {
        scanner.nextLine();
        System.out.println("Nhap ma mon hoc can xoa: ");
        String maMon = scanner.nextLine();
        deleteMonHoc(maMon);
    }

    private static void deleteMonHoc(String maMon) {

        if (monHocs.length == 0) {
            System.out.println("Danh sach mon hoc trong!");
            return;
        }

        MonHoc[] ans = null;

        for (int i = 0; i < monHocs.length; i++) {
            if (!Objects.equals(maMon, monHocs[i].getMaMon())) {
                if (ans == null) {
                    ans = new MonHoc[1];
                    ans[0] = monHocs[i];
                } else {
                    MonHoc[] tmp = ans.clone();
                    ans = new MonHoc[tmp.length + 1];
                    for (int j = 0; j < tmp.length; j++) {
                        ans[j] = tmp[j];
                    }
                    ans[tmp.length] = monHocs[i];
                }
            }
        }

        if (ans.length == monHocs.length) {
            System.out.println("Ma mon hoc khong ton tai!");
        } else {
            monHocs = ans.clone();
            System.out.println("Xoa mon hoc thanh cong!");
        }
    }


    //================================================Bang diem==========================================================

    private static void nhapDiem() {
        scanner = new Scanner(System.in);

        System.out.print("Nhap ma sinh vien: ");
        String maSV = scanner.nextLine();

        System.out.print("Nhap ma mon hoc: ");
        String maMon = scanner.nextLine();

        System.out.print("Nhap diem: ");
        float diem = scanner.nextFloat();

        Diem bangDiem = new Diem(maSV, maMon, diem);
        addBangDiem(bangDiem);
        System.out.println("Them bang diem thanh cong!");
    }

    private static void addBangDiem(Diem newData) {
        if (diems == null) {
            diems = new Diem[1];
            diems[0] = newData;
        } else {
            Diem[] tmp = diems.clone();
            diems = new Diem[tmp.length + 1];
            for (int i = 0; i < tmp.length; i++) {
                diems[i] = tmp[i];
            }
            diems[tmp.length] = newData;
        }
    }

    private static void suaDiem() {
        scanner.nextLine();
        System.out.println("Nhap ma sinh vien: ");
        String maSV = scanner.nextLine();
        System.out.println("Nhap ma mon hoc: ");
        String maMon = scanner.nextLine();
        System.out.println("Nhap diem moi: ");
        float diemMoi = scanner.nextFloat();
        Diem diemMoiObj = new Diem(maSV, maMon, diemMoi);
        updateDiem(diemMoiObj);
    }
    private static void updateDiem(Diem dataUpdate) {
        for (int i = 0; i < diems.length; i++) {
            if (Objects.equals(dataUpdate.getMaMon(), diems[i].getMaMon())
                    && Objects.equals(dataUpdate.getMaSV(), diems[i].getMaSV())
            ) {
                diems[i] = dataUpdate;
                System.out.println("Sua thanh cong!");
                return;
            }
        }
        System.out.println("Diem can sua khong ton tai!");
    }

    private static void xoaDiem() {
        scanner.nextLine();
        System.out.println("Nhap ma sinh vien: ");
        String maSV = scanner.nextLine();
        System.out.println("Nhap ma mon hoc: ");
        String maMon = scanner.nextLine();
        deleteDiem(maSV, maMon);
    }

    private static void deleteDiem(String maSV, String maMon) {

        if (diems.length == 0) {
            System.out.println("Danh sach mon hoc trong!");
            return;
        }

        Diem[] ans = null;

        for (int i = 0; i < diems.length; i++) {
            if (!Objects.equals(maMon, diems[i].getMaMon())
                    || !Objects.equals(maSV, diems[i].getMaSV())
            ) {
                if (ans == null) {
                    ans = new Diem[1];
                    ans[0] = diems[i];
                } else {
                    Diem[] tmp = ans.clone();
                    ans = new Diem[tmp.length + 1];
                    for (int j = 0; j < tmp.length; j++) {
                        ans[j] = tmp[j];
                    }
                    ans[tmp.length] = diems[i];
                }
            }
        }

        if (ans.length == diems.length) {
            System.out.println("Diem cua sinh vien khong ton tai!");
        } else {
            diems = ans.clone();
            System.out.println("Xoa diem thanh cong!");
        }
    }


}