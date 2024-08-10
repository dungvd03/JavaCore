package Bangdiemcanhan;
import java.util.Scanner;

public class BangDiem {
    private String msv;
    private String hoTen;
    private String ngaySinh;
    private String nganh;
    private HocPhan[] listHocPhan;

    public BangDiem() {
    }

    public BangDiem(String msv, String hoTen, String ngaySinh, String nganh, HocPhan[] listHocPhan) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.nganh = nganh;
        this.listHocPhan = listHocPhan;
    }

    public void nhapBangDiem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin sinh viên");
        System.out.print("Nhập mã sinh viên : ");
        msv = sc.nextLine();
        System.out.print("Nhập họ tên sinh viên : ");
        hoTen = sc.nextLine();
        System.out.print("Nhập ngày sinh : ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhập ngành : ");
        nganh = sc.nextLine();
        System.out.println("Nhập số lượng học phần : ");
        int n = sc.nextInt();
        listHocPhan = new HocPhan[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin học phần " + (i + 1) + " : ");
            listHocPhan[i] = new HocPhan();
            listHocPhan[i].nhapHocPhan();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (listHocPhan[i].getTenHocPhan().compareTo(listHocPhan[j].getTenHocPhan()) > 0) {
                    HocPhan tmp = listHocPhan[i];
                    listHocPhan[i] = listHocPhan[j];
                    listHocPhan[j] = tmp;
                }
            }
        }
    }

    public void showBangDiem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t\t\t BẢNG ĐIỂM CÁ NHÂN");
        System.out.println(String.format("Mã sinh viên: %-5s \t\t\t\t\t\t Họ và tên: %-5s ", msv, hoTen));
        System.out.println(String.format("Ngày sinh: %-5s \t\t\t\t\t\t\t Ngành: %-5s ", ngaySinh, nganh));

        float tongDiemHocPhan = 0;
        int tongSoTinChi = 0;
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(String.format("%-5s | %-20s | %-15s | %-10s | %-10s |", "STT", "Mã học phần", "Tên học phần", "Số tín chỉ", "Điểm học phần"));
        System.out.println("-----------------------------------------------------------------------------");
        for (int i = 0; i < listHocPhan.length; i++) {
//            listHocPhan[i].showHocPhan();
            System.out.println(String.format("%-5s | %-20s | %-15s | %10s | %13s |", i + 1, listHocPhan[i].getMaHocPhan(),
                    listHocPhan[i].getTenHocPhan(), listHocPhan[i].getSoTinChi(), listHocPhan[i].getDiemHocPhan()));
            System.out.println("-----------------------------------------------------------------------------");
        }

        for (int i = 0; i < listHocPhan.length; i++) {
            tongDiemHocPhan += listHocPhan[i].getSoTinChi() * listHocPhan[i].getDiemHocPhan();
            tongSoTinChi += listHocPhan[i].getSoTinChi();
        }

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t Điểm tổng kết : " + tongDiemHocPhan / tongSoTinChi);
        System.out.print("Nhấn ENTER để tiếp tục ...");
        sc.nextLine();
    }

    public void showDiemDuoi(float diem) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================== HỌC PHẦN CÓ ĐIỂM DƯỚI \"6\" ==========================");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(String.format("%-5s | %-20s | %-15s | %-10s | %-10s |", "STT", "Mã học phần", "Tên học phần", "Số tín chỉ", "Điểm học phần"));
        System.out.println("-----------------------------------------------------------------------------");
        for (int i = 0; i < listHocPhan.length; i++) {
            if (listHocPhan[i].getDiemHocPhan() < diem) {
                System.out.println(String.format("%-5s | %-20s | %-15s | %10s | %13s |", i + 1, listHocPhan[i].getMaHocPhan(),
                        listHocPhan[i].getTenHocPhan(), listHocPhan[i].getSoTinChi(), listHocPhan[i].getDiemHocPhan()));
                System.out.println("-----------------------------------------------------------------------------");
            }
        }
        System.out.print("Nhấn ENTER để tiếp tục ...");
        sc.nextLine();
    }

    public void edit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin mới về sinh viên");
        System.out.print("Nhập họ tên sinh viên:");
        hoTen = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhập ngành: ");
        nganh = sc.nextLine();
        System.out.println("Sửa thành công!");
        System.out.print("Nhấn ENTER để tiếp tục ...");
        sc.nextLine();
    }

    public void suaHocPhan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn học phần sửa :");
        String maHocPhan = sc.nextLine();
        for (int i = 0; i < listHocPhan.length; i++) {
            if (listHocPhan[i].getMaHocPhan().equals(maHocPhan)) {
                System.out.println("Nhập thông tin mới của học phần : ");
                listHocPhan[i].nhapHocPhan();
            }
        }
        System.out.println("Sửa thành công!");
        System.out.print("Nhấn ENTER để tiếp tục ...");
        sc.nextLine();
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public HocPhan[] getListHocPhan() {
        return listHocPhan;
    }

    public void setListHocPhan(HocPhan[] listHocPhan) {
        this.listHocPhan = listHocPhan;
    }
}
