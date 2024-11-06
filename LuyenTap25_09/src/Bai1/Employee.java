package Bai1;

import java.util.Scanner;

public class Employee {
    int code;
    String surname;
    String name;
    Date dateOfBirth;
    int yearWorking;

    public Employee() {
        dateOfBirth = new Date();
    }

    public Employee(int code, String surname, String name, Date dateOfBirth, int yearWorking) {
        this.code = code;
        this.surname = surname;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.yearWorking = yearWorking;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        this.code = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập họ: ");
        this.surname = sc.nextLine();
        System.out.print("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        this.dateOfBirth.nhap();
        System.out.print("Nhập số năm làm việc: ");
        this.yearWorking = sc.nextInt();
    }

    public void xuat() {
        System.out.println("Mã: " + code);
        System.out.println("Họ và tên: " + surname + " " + name);
        System.out.print("Ngày sinh: ");
        dateOfBirth.xuat();
        System.out.println("\nSố năm làm việc: " + yearWorking);
    }
}
