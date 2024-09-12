package SinhVien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String maSV;
    private String ten;
    private String diaChi;
    private String soDienThoai;
    
    public Student(String maSV, String ten, String diaChi, String soDienThoai) {
        this.maSV = maSV;
        this.ten = ten;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return maSV + "," + ten + "," + diaChi + "," + soDienThoai;
    }

    public static Student fromString(String studentData) {
        String[] parts = studentData.split(",");
        return new Student(parts[0], parts[1], parts[2], parts[3]);
    }

    public String getTen() {
        return ten;
    }

    public static class quanLySinhVien {

        
        public static void luuSinhVien(List<Student> students, String fileName) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                for (Student student : students) {
                    writer.write(student.toString());
                    writer.newLine();
                }
                System.out.println("Thông tin sinh viên được lưu vào file " + fileName);
            } catch (IOException e) {
                System.err.println("lỗi ghi vào tệp: " + e.getMessage());
            }
        }

        public static List<Student> docSinhVien(String fileName) {
            List<Student> students = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    students.add(Student.fromString(line));
                }
            } catch (IOException e) {
                System.err.println("Lôĩ khi đọc từ tệp: " + e.getMessage());
            }
            return students;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Student> students = new ArrayList<>();

            System.out.print("Nhập số lượng sinh viên: ");
            int numStudents = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < numStudents; i++) {
                System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
                System.out.print("Mã sinh viên: ");
                String studentID = scanner.nextLine();
                System.out.print("Tên: ");
                String name = scanner.nextLine();
                System.out.print("Địa chỉ: ");
                String address = scanner.nextLine();
                System.out.print("SDT: ");
                String phoneNumber = scanner.nextLine();
                students.add(new Student(studentID, name, address, phoneNumber));
            }

            String fileName = "SV.txt";
            luuSinhVien(students, fileName);

            List<Student> loadedStudents = docSinhVien(fileName);

            System.out.println("Sinh viên được thêm từ " + fileName + ":");
            for (Student student : loadedStudents) {
                System.out.println(student.getTen());
            }

            scanner.close();
        }
    }
}

