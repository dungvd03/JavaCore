import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        String chuoi;
        chuoi = nhapChuoi();
        xuatChuoi(chuoi);
    }
    public static String nhapChuoi(){
        Scanner sc = new Scanner(System.in);
        String chuoi;
        System.out.print("Nhap chuoi: ");
        chuoi = sc.nextLine();
        return chuoi;
    }
    public static void xuatChuoi(String chuoi){
        System.out.println("Chuoi ban vua nhap la: " + chuoi);
    }
}
