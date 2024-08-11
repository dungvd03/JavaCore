package Qlsv;

import java.util.Scanner;

public class SinhVien {
    private String maSinhVien;
    private String hoDem;
    private String ten;
    private String namSinh;
    private String gioiTinh;

    private HocPhan[] listHocPhan;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoDem, String ten, String namSinh, String gioiTinh, HocPhan[] listHocPhan) {
        this.maSinhVien = maSinhVien;
        this.hoDem = hoDem;
        this.ten = ten;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.listHocPhan = listHocPhan;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin SV");
        System.out.println("Nhap ma sinh vien: ");
        maSinhVien = sc.nextLine();
        System.out.println("Nhap ho: ");
        hoDem = sc.nextLine();
        System.out.println("Nhap ten: ");
        ten = sc.nextLine();
        System.out.println("Nhap ngay thang nam sinh: ");
        namSinh = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();

        System.out.println("Nhap so luong HP: ");
        int n = Integer.parseInt(sc.nextLine());
        listHocPhan = new HocPhan[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin HP " + (i + 1));
            listHocPhan[i] = new HocPhan();
            listHocPhan[i].nhap();
        }

    }

    public void show() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t\t\t THÔNG TIN SINH VIÊN");
        System.out.println(String.format("Mã sinh viên: %-5s \t\t\t\t\t\t Họ và tên: %-5s ", maSinhVien, hoDem.concat(" " + ten)));
        System.out.println(String.format("Năm sinh: %-5s \t\t\t\t\t\t\t Giới tính: %-5s ", namSinh, gioiTinh));

        float tongDiemHocPhan = 0;
        int tongSoTinChi = 0;

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(String.format("%-5s | %-20s | %-15s | %-10s | %-10s |", "STT", "Mã học phần", "Tên học phần", "Số tín chỉ", "Điểm học phần"));
        System.out.println("-----------------------------------------------------------------------------");
        for (int i = 0; i < listHocPhan.length; i++) {
            System.out.println(String.format("%-5s | %-20s | %-15s | %10s | %13s |", i + 1, listHocPhan[i].getMaHocPhan(),
                    listHocPhan[i].getTenHocPhan(), listHocPhan[i].getSoTinChi(), listHocPhan[i].getDiemHocPhan()));
            System.out.println("-----------------------------------------------------------------------------");
        }

        for (int i = 0; i < listHocPhan.length; i++) {
            tongDiemHocPhan += listHocPhan[i].getSoTinChi() * listHocPhan[i].getDiemHocPhan();
            tongSoTinChi += listHocPhan[i].getSoTinChi();
        }

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t Điểm tổng kết : " + tongDiemHocPhan / tongSoTinChi);
        System.out.print("Nhấn ENTER để tiếp tục ...");
        sc.nextLine();
    }

    public void edit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin moi SV");
        System.out.print("Nhap ho:");
        hoDem = sc.nextLine();
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap ngay thang sinh: ");
        namSinh = sc.nextLine();
        System.out.print("Nhập GT: ");
        gioiTinh = sc.nextLine();
        System.out.println("Sua thanh cong!");
        System.out.print("Nhấn ENTER để tiếp tục ...");
        sc.nextLine();
    }

    public void suaHocPhan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chon hoc phan  muon sua diem:");
        String maHocPhan = scanner.nextLine();
        for (int i=0; i< listHocPhan.length ;i++) {

            if (listHocPhan[i].getMaHocPhan().equals(maHocPhan)) {
                System.out.println("Nhap thong tin moi cua diem hoc phan: ");
                float diem = scanner.nextInt();
                listHocPhan[i].setDiemHocPhan(diem);
            }
        }
        System.out.println("Ban da sua diem thanh cong: ");
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoDem() {
        return hoDem;
    }

    public void setHoDem(String hoDem) {
        this.hoDem = hoDem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public HocPhan[] getListHocPhan() {
        return listHocPhan;
    }

    public void setListHocPhan(HocPhan[] listHocPhan) {
        this.listHocPhan = listHocPhan;
    }
}
