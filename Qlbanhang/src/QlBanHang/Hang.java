package QlBanHang;

public class Hang {
    private int id;
    private int loaiHangID;
    private  String tenHang;
    private int soLuong;
    private double donGia;

    public Hang() {
    }

    public Hang(int id, int loaiHangID, String tenHang, int soLuong, double donGia) {
        this.id = id;
        this.loaiHangID = loaiHangID;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLoaiHangID() {
        return loaiHangID;
    }

    public void setLoaiHangID(int loaiHangID) {
        this.loaiHangID = loaiHangID;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
}
