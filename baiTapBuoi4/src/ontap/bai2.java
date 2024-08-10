package ontap;

import java.util.Scanner;

public class bai2 {
    static String[] chuHos = new String[] {
            "Ho a", "Ho Truong", "Ho truOng", "Ho b", "Ho e"
    };

    static int[] soDiens = new int[] {
            100, 120, 10, 500, 24
    };

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choose;

        do {
            System.out.println("===========================================================");
            System.out.println("============================Menu===========================");
            System.out.println("1. Hiển thị danh sách tiền điện.");
            System.out.println("2. Hiển thị 3 hộ gia đình có số kwh điện tiêu thụ nhiều nhất.");
            System.out.println("3. Hiển thị các hộ gia đình có chủ hộ tên \"Truong\".");
            System.out.println("4. Sắp danh sách các hộ gia đình theo tên với thứ tự bảng chữ cái.");
            System.out.println("5. Sắp xếp danh sách các hộ gia đình theo số kwh điện tăng dần.");
            System.out.println("0. Thoát.");
            System.out.print("Chọn: ");

            try {
                choose = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Nhập không phải số!");
                return;
            }

            switch (choose) {
                case 1:
                    showAll();
                    break;
                case 2:
                    showTop(3);
                    break;
                case 3:
                    showFillName("Truong");
                    break;
                case 4:
                    sortByName();
                    break;
                case 5:
                    sortByKw();
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
        System.out.println("-----------------------------------------Danh sách-------------------------------------------");
        System.out.println(String.format("%-5s | %-30s | %10s | %15s ", "STT", "Chu ho", "So dien", "Tien(VND)"));
        for (int i = 0; i < chuHos.length ; i++) {
            System.out.println(String.format("%-5s | %-30s | %10d | %15s ", i+1, chuHos[i], soDiens[i], soDiens[i]*1000));
        }
        System.out.print("\nNhấn Enter để tiếp tục...");
        scanner.nextLine();
        scanner.nextLine();
    }

    private static void showTop(int top) {

        String[] chuHosTmp = chuHos.clone();
        int[] soDiensTmp = soDiens.clone();

        for (int i=0; i < soDiensTmp.length - 1; i++) {
            for (int j = i+1; j<soDiensTmp.length; j++) {
                if (soDiensTmp[i] < soDiensTmp[j]) {

                    int tmp = soDiensTmp[i];
                    soDiensTmp[i] = soDiensTmp[j];
                    soDiensTmp[j] = tmp;

                    String tmp2 = chuHosTmp[i];
                    chuHosTmp[i] = chuHosTmp[j];
                    chuHosTmp[j] = tmp2;
                }
            }
        }
        System.out.println("--------------------------------------Danh sách----------------------------------------");
        System.out.println(String.format("%-5s | %-30s | %10s | %15s ", "STT", "Chu ho", "So dien", "Tien(VND)"));
        for (int i = 0; i < top ; i++) {
            System.out.println(String.format("%-5s | %-30s | %10d | %15s ", i+1, chuHosTmp[i], soDiensTmp[i], soDiensTmp[i]*1000));
        }
        System.out.print("\nNhấn Enter để tiếp tục...");
        scanner.nextLine();
        scanner.nextLine();
    }

    private static void showFillName(String name) {
        System.out.println("--------------------------------------Danh sách----------------------------------------");
        System.out.println(String.format("%-5s | %-30s | %10s | %15s ", "STT", "Chu ho", "So dien", "Tien(VND)"));
        for (int i = 0; i < soDiens.length ; i++) {
            if (chuHos[i].toLowerCase().contains(name.toLowerCase())) {
                System.out.println(String.format("%-5s | %-30s | %10d | %15s ", i+1, chuHos[i], soDiens[i], soDiens[i]*1000));
            }
        }
        System.out.print("\nNhấn Enter để tiếp tục...");
        scanner.nextLine();
        scanner.nextLine();
    }

    private static void sortByName() {
        for (int i=0; i < soDiens.length - 1; i++) {
            for (int j = i+1; j<soDiens.length; j++) {
                if (chuHos[i].compareTo(chuHos[j]) > 0 ) {

                    int tmp = soDiens[i];
                    soDiens[i] = soDiens[j];
                    soDiens[j] = tmp;

                    String tmp2 = chuHos[i];
                    chuHos[i] = chuHos[j];
                    chuHos[j] = tmp2;
                }
            }
        }
        System.out.println("Danh sách đã được sắp xếp!");
        System.out.print("\nNhấn Enter để tiếp tục...");
        scanner.nextLine();
        scanner.nextLine();
    }

    private static void sortByKw() {
        for (int i=0; i < soDiens.length - 1; i++) {
            for (int j = i+1; j<soDiens.length; j++) {
                if (soDiens[i] > soDiens[j]) {

                    int tmp = soDiens[i];
                    soDiens[i] = soDiens[j];
                    soDiens[j] = tmp;

                    String tmp2 = chuHos[i];
                    chuHos[i] = chuHos[j];
                    chuHos[j] = tmp2;
                }
            }
        }
        System.out.println("Danh sách đã được sắp xếp!");
        System.out.print("\nNhấn Enter để tiếp tục...");
        scanner.nextLine();
        scanner.nextLine();
    }

}
