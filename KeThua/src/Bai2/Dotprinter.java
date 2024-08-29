package Bai2;

import java.util.Scanner;

public class Dotprinter extends Printer{
    protected String matDokim;


    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mat do kim: ");
        matDokim = sc.nextLine();
    }

    public void xuat(){
        super.xuat();
        System.out.println("Mat do kim: " + matDokim);
    }

}
