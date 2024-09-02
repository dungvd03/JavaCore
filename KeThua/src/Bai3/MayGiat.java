package Bai3;

public class MayGiat extends Electronic{
    private int dungTich;
    private String loai;

    public MayGiat(int congSuat, int dienAp, int dungTich, String loai) {
        super(congSuat, dienAp);
        this.dungTich = dungTich;
        this.loai = loai;
    }

    public void xuat(){
        System.out.println("MAYGIAT:");
        System.out.println("Cong Suat: " + getCongSuat() + "W");
        System.out.println("Dien Ap: " + getDienAp() + "V");
        System.out.println("Dung Tich: " + dungTich + " kg");
        System.out.println("Loai: " + loai);
    }
}
