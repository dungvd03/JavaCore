package Bai3;

public class Electronic {
    protected int congSuat;
    protected int dienAp;

    public Electronic(int congSuat, int dienAp) {
        this.congSuat = congSuat;
        this.dienAp = dienAp;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public int getDienAp() {
        return dienAp;
    }

    public void setDienAp(int dienAp) {
        this.dienAp = dienAp;
    }
}
