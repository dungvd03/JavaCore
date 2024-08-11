package Qlsv;

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

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hoc phan: ");
        maHocPhan = sc.nextLine();
        System.out.println("Nhap ten hoc phan: ");
        tenHocPhan = sc.nextLine();
        System.out.println("Nhap so tc: ");
        soTinChi = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap diem: ");
        diemHocPhan = Float.parseFloat(sc.nextLine());
    }

    public void show() {
        System.out.println("Ma HP: " + maHocPhan);
        System.out.println("Tên HP: " + tenHocPhan);
        System.out.println("Số TC: " + soTinChi);
        System.out.println("Điểm: " + diemHocPhan);
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
