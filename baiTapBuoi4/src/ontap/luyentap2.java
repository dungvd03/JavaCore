package ontap;

import java.util.Scanner;

public class luyentap2 {
    static String[] vanDongVien = new String[] {
            "Vu Duc Dung", "Vu Van Truong", "Nguyen Van An", "Nguyen Van Khiem", "Vu Thi Ly",
            "Vu Van Duc", "Nguyen Thi Mai", "Bui Xuan Truong", "Nguyen Thu Hoai", "Nguyen Minh Nghi"
    };

     static int[] lanThuNhat = new int[] {
             40, 120, 100, 80, 70, 50, 110, 100, 130, 30
     };

    static int[] lanThuHai = new int[] {
            50, 130, 110, 100, 50, 80, 90, 110, 100, 70
    };

    static int[] lanThuBa = new int[] {
            70, 100, 120, 90, 100, 90, 100, 90, 120, 100
    };

    static int[] tongThanhTich = new int[10];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choose;
        do {
            System.out.println("===========================================================");
            System.out.println("============================Menu===========================");
            System.out.println("1. Hiển thị danh sách vận động viên.");
            System.out.println("2. Hiển thị người có tổng thành tích lớn nhất.");
            System.out.println("3. Hiển thị 3 người có tổng thành tích lớn nhất.");
            System.out.println("4. Sắp danh sách các vận động viên theo tên với thứ tự bảng chữ cái.");
            System.out.println("5. Hiển thị danh sách vận động viên có tên bắt đầu bằng chữ 'T'.");
            System.out.println("6. Hiển thị danh sách vận động viên mà tên có vần \"an\".");
            System.out.println("7. Sắp xếp danh sách vận động viên theo chiều dài của tên tăng dần.");
            System.out.println("8. Hiển thị danh sách các vận động viên có lần cử tạ thứ 3 thấp nhất.");
            System.out.println("9. Hiển thị danh sách các vận động viên có cùng tổng thành tích.");
            System.out.println("10. Hiển thị danh sách các vận động viên có lần cử tạ thứ nhất cao nhất.");
            System.out.println("0. Thoát.");
            System.out.print("Chọn: ");

            try {
                choose = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Nhap khong phai so!!!!!");
                return;
            }

            switch (choose) {
                case 1:
                    showAll();
                    break;
                case 2:
                    showTop(1);
                    break;
                case 3:
                    showTop(3);
                    break;
                case 4:
                    sortByName();
                    break;
                case 5:
                    showFillName("t");
                    break;
                case 6:
                    showFillName("An");
                    break;
                case 7:
                    sortLengthName();
                    break;
                case 8:
                    cuTaThuBaThap(1);
                    break;
                case 9:
                    vdvCungThanhTich();
                    break;
                case 10:
                    cuTaThuNhatCao(1);
                    break;
                case 0:
                    System.out.println("Thoát.....");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        } while (choose != 0);
    }

    private static void showAll() {
        for (int i = 0; i < vanDongVien.length; i++) {
            tongThanhTich[i] = lanThuNhat[i] + lanThuHai[i] + lanThuBa[i];
        }
        System.out.println("--------------------------------------Danh sách----------------------------------------");
        System.out.println(String.format("%5s | %-30s | %15s | %15s | %15s | %15s", "STT", "VDV","Thu 1","Thu 2", "Thu 3", "Tong"));
        for (int i = 0; i < vanDongVien.length; i++) {
            System.out.println(String.format("%5s | %-30s | %15s | %15s | %15s | %15s", i+1, vanDongVien[i], lanThuNhat[i], lanThuHai[i], lanThuBa[i], tongThanhTich[i]));
        }
        System.out.print("\nNhấn Enter để tiếp tục...");
        sc.nextLine();
        sc.nextLine();
    }

    private static void showTop(int top) {
        String[] vanDongVienTmp = vanDongVien.clone();
        int[] tongThanhTichTmp = tongThanhTich.clone();

        for (int i = 0; i < tongThanhTichTmp.length - 1; i++) {
            for (int j = i + 1; j < tongThanhTichTmp.length; j++) {
                if (tongThanhTichTmp[i] < tongThanhTichTmp[j]) {

                    int tmp = tongThanhTichTmp[i];
                    tongThanhTichTmp[i] = tongThanhTichTmp[j];
                    tongThanhTichTmp[j] = tmp;

                    String tmp2 = vanDongVienTmp[i];
                    vanDongVienTmp[i] = vanDongVienTmp[j];
                    vanDongVienTmp[j] = tmp2;
                }
            }
        }
        System.out.println("--------------------------------------Danh sách----------------------------------------");
        System.out.println(String.format("%5s | %-30s |  %15s", "STT", "VDV", "Tong"));
        for (int i = 0; i < top; i++) {
            System.out.println(String.format("%5s | %-30s | %15s", i+1, vanDongVienTmp[i], tongThanhTichTmp[i]));
        }
        System.out.print("\nNhấn Enter để tiếp tục...");
        sc.nextLine();
        sc.nextLine();
    }

    private static void sortByName() {
        for (int i = 0; i < tongThanhTich.length - 1; i++) {
            for (int j = i + 1; j < tongThanhTich.length; j++) {
                if (vanDongVien[i].compareTo(vanDongVien[j]) > 0) {

                    int tmp = tongThanhTich[i];
                    tongThanhTich[i] = tongThanhTich[j];
                    tongThanhTich[j] = tmp;

                    String tmp2 = vanDongVien[i];
                    vanDongVien[i] = vanDongVien[j];
                    vanDongVien[j] = tmp2;

                    int tmp3 = lanThuNhat[i];
                    lanThuNhat[i] = lanThuNhat[j];
                    lanThuNhat[j] = tmp3;

                    int tmp4 = lanThuHai[i];
                    lanThuHai[i] = lanThuHai[j];
                    lanThuHai[j] = tmp4;

                    int tmp5 = lanThuBa[i];
                    lanThuBa[i] = lanThuBa[j];
                    lanThuBa[j] = tmp5;
                }
            }
        }
        System.out.println("Danh sách đã được sắp xếp!");
        System.out.print("\nNhấn Enter để tiếp tục...");
        sc.nextLine();
        sc.nextLine();
    }

    private static void showFillName(String name) {
        System.out.println("--------------------------------------Danh sách----------------------------------------");
        System.out.println(String.format("%5s | %-30s | %15s | %15s | %15s | %15s", "STT", "VDV","Thu 1","Thu 2", "Thu 3", "Tong"));
        for (int i = 0; i < tongThanhTich.length; i++) {
            if (vanDongVien[i].toLowerCase().contains(name.toLowerCase())) {
                System.out.println(String.format("%5s | %-30s | %15s | %15s | %15s | %15s", i+1, vanDongVien[i], lanThuNhat[i], lanThuHai[i], lanThuBa[i], tongThanhTich[i]));
            }
        }
        System.out.print("\nNhấn Enter để tiếp tục...");
        sc.nextLine();
        sc.nextLine();
    }

    private static void sortLengthName() {
        for (int i = 0; i < tongThanhTich.length; i++) {
            for (int j = 0; j < tongThanhTich.length; j++) {
                if (vanDongVien[i].length() < vanDongVien[j].length()) {

                    int tmp = tongThanhTich[i];
                    tongThanhTich[i] = tongThanhTich[j];
                    tongThanhTich[j] = tmp;

                    String tmp2 = vanDongVien[i];
                    vanDongVien[i] = vanDongVien[j];
                    vanDongVien[j] = tmp2;

                    int tmp3 = lanThuNhat[i];
                    lanThuNhat[i] = lanThuNhat[j];
                    lanThuNhat[j] = tmp3;

                    int tmp4 = lanThuHai[i];
                    lanThuHai[i] = lanThuHai[j];
                    lanThuHai[j] = tmp4;

                    int tmp5 = lanThuBa[i];
                    lanThuBa[i] = lanThuBa[j];
                    lanThuBa[j] = tmp5;
                }
            }
        }
        System.out.println("--------------------------------------Danh sách----------------------------------------");
        System.out.println(String.format("%5s | %-30s | %15s | %15s | %15s | %15s", "STT", "VDV","Thu 1","Thu 2", "Thu 3", "Tong"));
        for (int i = 0; i < tongThanhTich.length; i++) {
            System.out.println(String.format("%5s | %-30s | %15s | %15s | %15s | %15s", i+1, vanDongVien[i], lanThuNhat[i], lanThuHai[i], lanThuBa[i], tongThanhTich[i]));
        }
        System.out.print("\nNhấn Enter để tiếp tục...");
        sc.nextLine();
        sc.nextLine();
    }

    private static void vdvCungThanhTich() {
        int equal = tongThanhTich[1];
        System.out.println("--------------------------------------Danh sách----------------------------------------");
        System.out.println(String.format("%5s | %-30s | %15s | %15s | %15s | %15s", "STT", "VDV","Thu 1","Thu 2", "Thu 3", "Tong"));
        for (int i = 0; i < vanDongVien.length; i++) {
            if (tongThanhTich[i] == equal) {
                equal = tongThanhTich[i];
                System.out.println(String.format("%5s | %-30s | %15s | %15s | %15s | %15s", i+1, vanDongVien[i], lanThuNhat[i], lanThuHai[i], lanThuBa[i], tongThanhTich[i]));
            }
        }
        System.out.print("\nNhấn Enter để tiếp tục...");
        sc.nextLine();
        sc.nextLine();
    }

    private static void cuTaThuBaThap(int cuoi) {
        String[] vanDongVienTmp = vanDongVien.clone();
        int[] lanThuBaTmp = lanThuBa.clone();
        for (int i = 0; i < lanThuBa.length - 1; i++) {
            for (int j = i + 1; j < lanThuBa.length; j++) {
                if (lanThuBaTmp[i] > lanThuBaTmp[j]) {
                    int tmp = lanThuBaTmp[i];
                    lanThuBaTmp[i] = lanThuBaTmp[j];
                    lanThuBaTmp[j] = tmp;

                    String tmp2 = vanDongVienTmp[i];
                    vanDongVienTmp[i] = vanDongVienTmp[j];
                    vanDongVienTmp[j] = tmp2;
                }
            }
        }
        System.out.println("----------------------------------Lan cu ta thu 3 thap nhat-------------------------------");
        System.out.println(String.format("%5s | %-30s |  %15s", "STT", "VDV", "Thu 3"));
        for (int i = 0; i < cuoi; i++) {
            System.out.println(String.format("%5s | %-30s | %15s", i + 1, vanDongVienTmp[i], lanThuBaTmp[i]));
        }
        System.out.print("\nNhấn Enter để tiếp tục...");
        sc.nextLine();
        sc.nextLine();
    }

    private static void cuTaThuNhatCao(int top) {
        String[] vanDongVienTmp = vanDongVien.clone();
        int[] lanThuNhatTmp = lanThuNhat.clone();
        for (int i = 0; i < lanThuNhat.length - 1; i++) {
            for (int j = i + 1; j < lanThuNhat.length; j++) {
                if (lanThuNhatTmp[i] < lanThuNhatTmp[j]) {
                    int tmp = lanThuNhatTmp[i];
                    lanThuNhatTmp[i] = lanThuNhatTmp[j];
                    lanThuNhatTmp[j] = tmp;

                    String tmp2 = vanDongVienTmp[i];
                    vanDongVienTmp[i] = vanDongVienTmp[j];
                    vanDongVienTmp[j] = tmp2;
                }
            }
        }
        System.out.println("---------------------------------Lan cu ta thu 1 cao nhat -----------------------------------");
        System.out.println(String.format("%5s | %-30s |  %15s", "STT", "VDV", "Thu 1"));
        for (int i = 0; i < top; i++) {
            System.out.println(String.format("%5s | %-30s | %15s", i + 1, vanDongVienTmp[i], lanThuNhatTmp[i]));
        }
        System.out.print("\nNhấn Enter để tiếp tục...");
        sc.nextLine();
        sc.nextLine();
    }

}
