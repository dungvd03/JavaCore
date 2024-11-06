package Bai1;

import java.util.Scanner;

public class Teacher extends Employee {
    private Subject subject;
    private double coefficientsSalary;
    private double salary;
    private int numberOfTeachingHours;

    public Teacher(){
        super();
        subject = new Subject();
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNumberOfTeachingHours() {
        return numberOfTeachingHours;
    }

    public void setNumberOfTeachingHours(int numberOfTeachingHours) {
        this.numberOfTeachingHours = numberOfTeachingHours;
    }

    public Teacher(int code, String surname, String name, Date dateOfBirth, int yearWorking, Subject subject, double coefficientsSalary, int numberOfTeachingHours, double salary) {
        super(code, surname, name, dateOfBirth, yearWorking);
        this.subject = subject;
        this.coefficientsSalary = coefficientsSalary;
        this.numberOfTeachingHours = numberOfTeachingHours;
        this.salary = salary;
    }

    public void nhap() {
        super.nhap();
        subject.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hệ số lương: ");
        this.coefficientsSalary = sc.nextDouble();
        System.out.print("Nhập số giờ dạy: ");
        this.numberOfTeachingHours = sc.nextInt();
    }

    public void xuat() {
        super.xuat();
        subject.xuat();
        System.out.println("Hệ số lương: " + coefficientsSalary);
        System.out.println("Số giờ dạy: " + numberOfTeachingHours);
        System.out.println("Lương: " + salary);
    }

    public void calcuSalary() {
        this.salary = coefficientsSalary * 1150000 + numberOfTeachingHours * 60000;
    }
}
