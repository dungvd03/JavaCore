package QlBanHang;

public class GioHang {
    private int id;
    private String tenHang;
    private int loaiHangID;

    public GioHang() {
    }

    public GioHang(int id, String tenHang, int loaiHangID) {
        this.id = id;
        this.tenHang = tenHang;
        this.loaiHangID = loaiHangID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getLoaiHangID() {
        return loaiHangID;
    }

    public void setLoaiHangID(int loaiHangID) {
        this.loaiHangID = loaiHangID;
    }
}
