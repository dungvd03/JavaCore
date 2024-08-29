package Bai1;

import java.util.Scanner;

public class HangDienTu extends SanPham{
    private String[] congSuat;
    private String[] dongDienSuDung;

    public void nhap(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap thong tin");
        System.out.print("Nhập số lượng sản phẩm : ");
        int n = sc.nextInt();
        sc.nextLine();

        maSanPham = new String[n];
        tenSanPham = new String[n];
        ngaySanXuat = new String[n];
        trongLuong = new int[n];
        mauSac = new String[n];
        congSuat = new String[n];
        dongDienSuDung = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Sản phẩm thứ " + (i + 1));
            System.out.print("Nhập mã sản phẩm : ");
            maSanPham[i] = sc.nextLine();
            System.out.print("Nhập tên sản phẩm : ");
            tenSanPham[i] = sc.nextLine();
            System.out.print("Nhập ngày sản xuất : ");
            ngaySanXuat[i] = sc.nextLine();
            System.out.print("Nhập trọng lượng (kg) : ");
            trongLuong[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhập màu sắc : ");
            mauSac[i] = sc.nextLine();
            System.out.print("Nhập công suất (kw) : ");
            congSuat[i] = sc.nextLine();
            System.out.print("Nhập dòng điện sử dụng (1 chiều / 2 chiều) : ");
            dongDienSuDung[i] = sc.nextLine();
        }
    }

    public void xuat(){
        System.out.println("=============================================== DANH SÁCH HÀNG ĐIỆN TỬ ====================================================");
        System.out.println("+-------+-------------+----------------------+-----------------+------------+------------+------------+-------------------+");
        System.out.println(String.format("| %-5s | %-10s | %-20s | %-15s | %-10.2s | %-10s | %-10s | %-13s |", "STT", "Mã sản phẩm", "Tên sản phẩm", "Ngày sản xuất", "Trọng lượng", "Màu sắc", "Công suất", "Dòng điện sử dụng"));
        for (int i = 0; i < maSanPham.length; i++) {
            System.out.println("+-------+-------------+----------------------+-----------------+------------+------------+------------+-------------------+");
            System.out.println(String.format("| %-5s | %-11s | %-20s | %15s | %10.2s | %10s | %10s | %17s |", i + 1, maSanPham[i], tenSanPham[i], ngaySanXuat[i], trongLuong[i], mauSac[i], congSuat[i], dongDienSuDung[i]));
        }
        System.out.println("+-------+-------------+----------------------+-----------------+------------+------------+------------+-------------------+");

    }

    public void matHangMin(){
        String[] maSanPhamTmp = maSanPham.clone();
        String[] tenSanPhamTmp = tenSanPham.clone();
        String[] ngaySanXuatTmp = ngaySanXuat.clone();
        int[] trongLuongTmp = trongLuong.clone();
        String[] mauSacTmp = mauSac.clone();
        String[] congSuatTmp = congSuat.clone();
        String[] dongDienSuDungTmp = dongDienSuDung.clone();

        for (int i = 0; i < trongLuong.length - 1; i++) {
            for (int j = i + 1; j < trongLuong.length; j++) {
                if (trongLuongTmp[i] > trongLuongTmp[j]) {

                    int tmp = trongLuongTmp[i];
                    trongLuongTmp[i] = trongLuongTmp[j];
                    trongLuongTmp[j] = tmp;

                    String tmp1 = maSanPhamTmp[i];
                    maSanPhamTmp[i] = maSanPhamTmp[j];
                    maSanPhamTmp[j] = tmp1;

                    String tmp2 = tenSanPhamTmp[i];
                    tenSanPhamTmp[i] = tenSanPhamTmp[j];
                    tenSanPhamTmp[j] = tmp2;

                    String tmp3 = ngaySanXuatTmp[i];
                    ngaySanXuatTmp[i] = ngaySanXuatTmp[j];
                    ngaySanXuatTmp[j] = tmp3;

                    String tmp4 = mauSacTmp[i];
                    mauSacTmp[i] = mauSacTmp[j];
                    mauSacTmp[j] = tmp4;

                    String tmp5 = congSuatTmp[i];
                    congSuatTmp[i] = congSuatTmp[j];
                    congSuatTmp[j] = tmp5;

                    String tmp6 = dongDienSuDungTmp[i];
                    dongDienSuDungTmp[i] = dongDienSuDungTmp[j];
                    dongDienSuDungTmp[j] = tmp6;

                }

            }
        }
    }
    public HangDienTu() {
    }

    public HangDienTu(String[] maSanPham, String[] tenSanPham, String[] ngaySanXuat, int[] trongLuong, String[] mauSac, String[] congSuat, String[] dongDienSuDung) {
        super(maSanPham, tenSanPham, ngaySanXuat, trongLuong, mauSac);
        this.congSuat = congSuat;
        this.dongDienSuDung = dongDienSuDung;
    }

    public String[] getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String[] congSuat) {
        this.congSuat = congSuat;
    }

    public String[] getDongDienSuDung() {
        return dongDienSuDung;
    }

    public void setDongDienSuDung(String[] dongDienSuDung) {
        this.dongDienSuDung = dongDienSuDung;
    }
}
