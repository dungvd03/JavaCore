import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        HocSinh hocSinh = new HocSinh();
        hocSinh.nhapThongTin();
        hocSinh.xuatThongTin();
    }
    static class HocSinh {
        String ten;
        String msv;
        int tuoi;
        String gt;
        String lop;


        public  void nhapThongTin(){
            Scanner sc = new Scanner(System.in);
            System.out.print("nhap ten: ");
            ten = sc.nextLine();
            System.out.print("Nhap ma sv: ");
            msv = sc.nextLine();
            System.out.print("Nhap tuoi: ");
            tuoi = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhap gioi tinh: ");
            gt = sc.nextLine();
            System.out.print("Nhap lop: ");
            lop = sc.nextLine();
        }

        public void xuatThongTin(){
            System.out.println("Ten cua sinh vien: " + ten);
            System.out.println("Ma sinh vien: " + msv);
            System.out.println("Tuoi: " + tuoi);
            System.out.println("Gioi tinh: " + gt);
            System.out.println("Lop: " + lop);
        }
    }
}
