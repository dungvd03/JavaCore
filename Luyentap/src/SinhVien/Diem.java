package SinhVien;

public class Diem {

    private String maSV;
    private String maMon;
    private float diem;


    public Diem(String maSV, String maMon, float diem) {
        this.maSV = maSV;
        this.maMon = maMon;
        this.diem = diem;
    }

    public Diem() {
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
}
