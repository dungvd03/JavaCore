package Bai2;

import java.util.Scanner;

public class Main {
    public static NhanSu[] danhSachNhanSu;

    public static void main(String[] args) {
        CongNhan congNhan1 = new CongNhan(001,"Vu","Dung","Nam",new XuongSX("HT","Dung",4),"Mang vac",23,1200000);
        addNhanSu(congNhan1);
        CongNhan congNhan2 = new CongNhan(002,"Duc","Dung","Nam",new XuongSX("TM","Van",5),"Quan ly",22,1100000);
        addNhanSu(congNhan2);
        CongNhan congNhan3 = new CongNhan(003,"Pham","Huong","Nu",new XuongSX("PM","Dung",4),"thu ngan",23,1200000);
        addNhanSu(congNhan3);
        CanBo canBo1 = new CanBo(004,"Vu","Dung","Nam",new Phong("Quan Ly","Van Huong"),"To truong",3,"A",2000000);
        addNhanSu(canBo1);
        CanBo canBo2 = new CanBo(005,"Vu","Linh","Nu",new Phong("Thong tin","Van Ly"),"To pho",2,"C",1000000);
        addNhanSu(canBo2);
        CanBo canBo3 = new CanBo(006,"Vu","Nhi","Nu",new Phong("Maketing","VThu"),"Truong ban",2,"A",2000000);
        addNhanSu(canBo3);


        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Nhập danh sách nhân sự");
            System.out.println("2. Hiển thị danh sách nhân sự");
            System.out.println("3. Hiển thị danh sách công nhân nam");
            System.out.println("4. Hiển thị danh sách cán bộ nữ");
            System.out.println("5. Hiển thị cán bộ có lương cao nhất");
            System.out.println("6. Hiển thị công nhân có lương thấp nhất");
            System.out.println("0. Thoát");
            System.out.print("Chọn một lựa chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng nhân sự: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("\nChọn loại nhân sự (1 - Cán bộ, 2 - Công nhân): ");
                        int loai = sc.nextInt();
                        sc.nextLine();
                        NhanSu ns;
                        if (loai == 1) {
                            ns = new CanBo();
                            ns.nhap();
                        } else {
                            ns = new CongNhan();
                            ns.nhap();
                        }
                        addNhanSu(ns);
                    }
                    break;

                case 2:

                    System.out.println("\nDanh sách nhân sự:");
                    hienThiDanhSachNhanSu();
                    break;

                case 3:
                    System.out.println("\nDanh sách công nhân nam:");
                    hienThiCongNhanNam();
                    break;

                case 4:
                    System.out.println("\nDanh sách cán bộ nữ:");
                    hienThiCanBoNu();
                    break;
                case 5:
                    hienThiCanBoLuongCaoNhat();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);

        sc.close();
    }

    private static void addNhanSu(NhanSu nhanSuNew) {
        if (danhSachNhanSu == null) {
            danhSachNhanSu = new NhanSu[1];
            danhSachNhanSu[0] = nhanSuNew;
        } else {
            NhanSu[] tmp = danhSachNhanSu.clone();
            danhSachNhanSu = new NhanSu[tmp.length + 1];
            for (int i = 0; i < tmp.length; i++) {
                danhSachNhanSu[i] = tmp[i];
            }
            danhSachNhanSu[tmp.length] = nhanSuNew;
        }
    }

    private static void hienThiDanhSachNhanSu() {
        if (danhSachNhanSu != null) {
            for (NhanSu ns : danhSachNhanSu) {
                ns.xuat();
            }
        } else {
            System.out.println("Danh sách nhân sự rỗng.");
        }
    }

    public static void hienThiCongNhanNam() {
        if (danhSachNhanSu != null) {
            for (NhanSu ns : danhSachNhanSu) {
                if (ns instanceof CongNhan && ns.getGioiTinh().equals("Nam")) {
                    ns.xuat();
                }
            }
        }
    }
    public static void hienThiCanBoNu() {
        if (danhSachNhanSu != null) {
            for (NhanSu ns : danhSachNhanSu) {
                if (ns instanceof CanBo && ns.getGioiTinh().equals("Nu")) {
                    ns.xuat();
                }
            }
        }
    }


    public static void hienThiCanBoLuongCaoNhat() {
        if (danhSachNhanSu != null) {
            double maxLuong = Double.MIN_VALUE;
            for (NhanSu ns : danhSachNhanSu) {
                if (ns instanceof CanBo && ns.tinhLuong() > maxLuong) {
                    maxLuong = ns.tinhLuong();
                }
            }
            System.out.println("Danh sách cán bộ có lương cao nhất:");
            for (NhanSu ns : danhSachNhanSu) {
                if (ns instanceof CanBo && ns.tinhLuong() == maxLuong) {
                    ns.xuat();
                }
            }
        } else {
            System.out.println("Danh sách nhân sự rỗng.");
        }
    }





}
