package Bai2;

import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        LaserPrintter laserPrintter = new LaserPrintter();
        Dotprinter dotprinter = new Dotprinter();

        System.out.println("Nhap thong tin cho may in Laser: ");
        laserPrintter.nhap();

        System.out.println("Nhap thong tin cho may in kim: ");
        dotprinter.nhap();

        System.out.println("Thong tin cho may in Laser: ");
        laserPrintter.xuat();

        System.out.println("---------------------------------");

        System.out.println("Thong tin cho may in kim: ");
        dotprinter.xuat();
    }
}
