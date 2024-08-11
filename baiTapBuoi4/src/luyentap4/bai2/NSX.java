package luyentap4.bai2;

import java.util.Scanner;

public class NSX {
    private String maNSX;
    private String tenNSX;
    private String dcNSX;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã NSX: ");
        maNSX = sc.nextLine();
        System.out.println("Nhập tên NSX: ");
        tenNSX = sc.nextLine();
        System.out.println("Nhập địa chỉ NSX: ");
        dcNSX = sc.nextLine();
    }

    public void xuat(){
        System.out.println("Mã nhà sản xuất: " + maNSX);
        System.out.println("Tên nhà sản xuất: " + tenNSX);
        System.out.println("Địa chỉ nhà sản xuất: " + dcNSX);
    }
}
