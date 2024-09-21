package SinhVien;

public class MonHoc {

    private String maMon;
    private String tenMon;
    private int heSo;

    public MonHoc(String maMon, String tenMon, int heSo) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.heSo = heSo;
    }

    public MonHoc() {
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getHeSo() {
        return heSo;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }
}

