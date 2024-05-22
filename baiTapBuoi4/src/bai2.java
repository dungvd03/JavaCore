import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        double chuVi;
        double dienTich;
        System.out.print("Canh A: ");
        a = Double.parseDouble(sc.nextLine());
        System.out.print("Canh B: ");
        b = Double.parseDouble(sc.nextLine());
        System.out.print("Canh C: ");
        c = Double.parseDouble(sc.nextLine());
        if(a + b > c && b + c > a && c + a > b){
            chuVi = tinhChuVi(a, b, c);
            System.out.println("Chu vi cua tam giac la :" + chuVi);
            dienTich = tinhDienTich(a, b, c);
            System.out.println("chu vi cua tam giac la :" + dienTich);
        }
        else
            System.out.println("khong phai tam giac");
    }
    public static double tinhChuVi(double a, double b, double c){
        return (a + b + c);
    }
    public static double tinhDienTich(double a, double b, double c){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
