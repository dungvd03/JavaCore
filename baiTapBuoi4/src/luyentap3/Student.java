package luyentap3;

import java.util.List;

public class Student {
    private int msv;
    private String hoTen;
    private int ngaySinh;
    private  String nganh;
    private int maHocPhan;
    private String tenHocPhan;
    private int soTinChi;
    private int diemHocPham;
    private List<MonHoc> danhSachMonHoc;


    public void themMonHoc(MonHoc monHoc) {
        danhSachMonHoc.add(monHoc);
    }

    public void hienThiBangDiem() {
        System.out.println("Bảng Điểm Cá Nhân");
        System.out.println("Mã sinh viên: " + msv);
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Ngành: " + nganh);
        System.out.println("\nSTT \t Mã Học Phần \t Tên Học Phần \t Số Tín Chỉ \t Điểm");
        for (int i = 0; i < danhSachMonHoc.size(); i++) {
            MonHoc mh = danhSachMonHoc.get(i);
            System.out.println((i + 1) + "\t" + mh.maHocPhan + "\t" + mh.tenHocPhan + "\t" + mh.soTinChi + "\t" + mh.diem);
        }
    }



    public Student(String maSV, String ten, String ngaySinh, String nganh) {
    }

    public Student(int msv, String hoTen, int ngaySinh, String nganh, int maHocPhan, String tenHocPhan, int soTinChi, int diemHocPham, List<MonHoc> danhSachMonHoc) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.nganh = nganh;
        this.maHocPhan = maHocPhan;
        this.tenHocPhan = tenHocPhan;
        this.soTinChi = soTinChi;
        this.diemHocPham = diemHocPham;
        this.danhSachMonHoc = danhSachMonHoc;
    }

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getMaHocPhan() {
        return maHocPhan;
    }

    public void setMaHocPhan(int maHocPhan) {
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

    public int getDiemHocPham() {
        return diemHocPham;
    }

    public void setDiemHocPham(int diemHocPham) {
        this.diemHocPham = diemHocPham;
    }

    public List<MonHoc> getDanhSachMonHoc() {
        return danhSachMonHoc;
    }

    public void setDanhSachMonHoc(List<MonHoc> danhSachMonHoc) {
        this.danhSachMonHoc = danhSachMonHoc;
    }

    @Override
    public String toString() {
        return "Student{" +
                "msv=" + msv +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", nganh='" + nganh + '\'' +
                ", maHocPhan=" + maHocPhan +
                ", tenHocPhan='" + tenHocPhan + '\'' +
                ", soTinChi=" + soTinChi +
                ", diemHocPham=" + diemHocPham +
                ", danhSachMonHoc=" + danhSachMonHoc +
                '}';
    }
}
class MonHoc {
    public String maHocPhan;
    public String tenHocPhan;
    public int soTinChi;
    public double diem;

    public MonHoc(String maHocPhan, String tenHocPhan, int soTinChi, double diem) {
        this.maHocPhan = maHocPhan;
        this.tenHocPhan = tenHocPhan;
        this.soTinChi = soTinChi;
        this.diem = diem;
    }
}
