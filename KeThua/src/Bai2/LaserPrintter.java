package Bai2;

import java.util.Scanner;

public class LaserPrintter extends Printer {
    protected double doPhanGiai;


    public void nhap(){
        Scanner sc = new Scanner(System.in);

        super.nhap();
        System.out.println("nhap do phan giai: ");
        doPhanGiai = sc.nextDouble();
    }

    public void xuat(){
        super.xuat();
        System.out.println("Do phan giai: " + doPhanGiai + " dpi");
    }

}
