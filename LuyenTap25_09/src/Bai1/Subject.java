package Bai1;

import java.util.Scanner;

public class Subject {
    private int code;
    private String name;

    public Subject() {
    }

    public Subject(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã môn học: ");
        this.code = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tên môn học: ");
        this.name = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Mã môn: " + code);
        System.out.println("Tên môn: " + name);
    }
}
