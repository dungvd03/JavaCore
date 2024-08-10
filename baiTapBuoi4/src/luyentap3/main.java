package luyentap3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên:");
        String maSV = scanner.nextLine();
        System.out.println("Nhập họ tên:");
        String ten = scanner.nextLine();
        System.out.println("Nhập ngày sinh:");
        String ngaySinh = scanner.nextLine();
        System.out.println("Nhập ngành:");
        String nganh = scanner.nextLine();

        Student student = new Student(maSV, ten, ngaySinh, nganh);

        // Tiếp tục nhập các môn học và điểm cho sinh viên
        System.out.println("Nhập số lượng môn học:");
        int soMonHoc = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < soMonHoc; i++) {
            System.out.println("Nhập mã học phần:");
            String maHP = scanner.nextLine();
            System.out.println("Nhập tên học phần:");
            String tenHP = scanner.nextLine();
            System.out.println("Nhập số tín chỉ:");
            int stc = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập điểm:");
            double diem = Double.parseDouble(scanner.nextLine());

            MonHoc mh = new MonHoc(maHP, tenHP, stc, diem);
            student.themMonHoc(mh);
        }

        student.hienThiBangDiem();

    }
}

