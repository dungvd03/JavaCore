package Sach;



public class Sach {
    private String maSach;
    private String tenSach;
    private String namTaiBan;
    private String nhaXuatBan;
    private String tacGia;

    public Sach(String maSach, String tenSach, String namTaiBan, String nhaXuatBan, String tacGia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.namTaiBan = namTaiBan;
        this.nhaXuatBan = nhaXuatBan;
        this.tacGia = tacGia;
    }

    // Getter và Setter cho các thuộc tính
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNamTaiBan() {
        return namTaiBan;
    }

    public void setNamTaiBan(String namTaiBan) {
        this.namTaiBan = namTaiBan;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    @Override
    public String toString() {
        return "Mã sách: " + maSach + ", Tên sách: " + tenSach + ", Năm tái bản: " + namTaiBan
                + ", Nhà xuất bản: " + nhaXuatBan + ", Tác giả: " + tacGia;
    }
}

