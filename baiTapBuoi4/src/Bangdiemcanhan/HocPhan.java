package Bangdiemcanhan;

import java.util.Scanner;

public class HocPhan {
    private String maHocPhan;
    private String tenHocPhan;
    private int soTinChi;
    private float diemHocPhan;

    public HocPhan() {
    }

    public HocPhan(String maHocPhan, String tenHocPhan, int soTinChi, float diemHocPhan) {
        this.maHocPhan = maHocPhan;
        this.tenHocPhan = tenHocPhan;
        this.soTinChi = soTinChi;
        this.diemHocPhan = diemHocPhan;
    }

    public void nhapHocPhan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã học phần : ");
        maHocPhan = sc.nextLine();
        System.out.println("Nhập tên học phần : ");
        tenHocPhan = sc.nextLine();
        System.out.println("Nhập số tín chỉ : ");
        soTinChi = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập điểm học phần : ");
        diemHocPhan = Float.parseFloat(sc.nextLine());
    }

    public void showHocPhan() {

    }

    public String getMaHocPhan() {
        return maHocPhan;
    }

    public void setMaHocPhan(String maHocPhan) {
        this.maHocPhan = maHocPhan;
    }

    public String getTenHocPhan() {
        return tenHocPhan;
    }

    public void setTenHocPhan(String tenHocPhan) {
        this.tenHocPhan = tenHocPhan;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public float getDiemHocPhan() {
        return diemHocPhan;
    }

    public void setDiemHocPhan(float diemHocPhan) {
        this.diemHocPhan = diemHocPhan;
    }
}
