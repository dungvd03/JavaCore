package Bai3;

public class TuLanh extends Electronic{
    private int dungTich;
    private int soNgan;

    public TuLanh(int congSuat, int dienAp, int dungTich, int soNgan) {
        super(congSuat, dienAp);
        this.dungTich = dungTich;
        this.soNgan = soNgan;
    }

    public void xuat() {
        System.out.println("TULANH:");
        System.out.println("Cong Suat: " + getCongSuat() + "W");
        System.out.println("Dien Ap: " + getDienAp() + "V");
        System.out.println("Dung Tich: " + dungTich + " lit");
        System.out.println("So Ngan: " + soNgan);
    }
}
