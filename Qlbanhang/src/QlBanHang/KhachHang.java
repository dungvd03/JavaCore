package QlBanHang;

public class KhachHang {
    private int id;
    private  String tenKhachHang;
    private int loaiHangID;

    public KhachHang() {
    }

    public KhachHang(int id, String tenKhachHang, int loaiHangID) {
        this.id = id;
        this.tenKhachHang = tenKhachHang;
        this.loaiHangID = loaiHangID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public int getLoaiHangID() {
        return loaiHangID;
    }

    public void setLoaiHangID(int loaiHangID) {
        this.loaiHangID = loaiHangID;
    }
}
